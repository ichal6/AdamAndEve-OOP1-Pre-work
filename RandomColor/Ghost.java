import java.util.*; 

public class Ghost {
  private String color;
  Ghost(){
    setColor(); 
  }
  
  private void setColor(){
    Random generate = new Random();
    int number = generate.nextInt(4);
    switch(number){
      case 0:
        color = "red";
        break;
      case 1:
        color = "yellow";
        break;
      case 2:
        color = "purple";
        break;
      case 3:
        color = "white";
        break;
    
    }
    
  }

  
  
  public String getColor(){
    return color;
  }
}