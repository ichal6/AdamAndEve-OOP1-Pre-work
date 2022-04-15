public class Kata {
  public static String declareWinner(Fighter fighter1, Fighter fighter2, String firstAttacker) {
      boolean fighter1Attack;
      if(fighter1.name == firstAttacker){
        fighter1Attack = true;
      }else{
        fighter1Attack = false;
      }
      while(true){
        if(fighter1.health <= 0){
            return fighter2.name;
        }else if(fighter2.health <= 0){
            return fighter1.name;
        }
        if(fighter1Attack == true){
            fighter2.health -= fighter1.damagePerAttack;
            fighter1Attack = false;
        }else{
            fighter1.health -= fighter2.damagePerAttack;
            fighter1Attack = true;
        }
      }
  }
}

