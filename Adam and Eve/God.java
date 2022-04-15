public class God {
  public static Human[] create(){

     Man newMan = new Man(true);
     Woman newWomen = new Woman(false);

     Human[] newPeople = new Human[] {newMan, newWomen};
    
    return newPeople;
  }

}

class Human{

    Human(){

    }

    Human(boolean isMan){
        if(isMan){
            Man adam = new Man(true);
        }else{
            Woman eve = new Woman(false);
        }
     
    }
}


class Man extends Human{
    public Man(){
        super();
    }

    public Man(boolean isMan){

    }

}

class Woman extends Human{
    Woman() {
        super();
    }

    public Woman(boolean isMan){

    }

}
