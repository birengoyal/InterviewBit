package practiceDesignFactoryPattern;

import java.util.Scanner;

public class EnemyShipTestingg {
   
   public static void main(String[] args) {

      EnemyShipFactory shipFactory = new EnemyShipFactory();
      EnemyShip theEnemyShip = null;
      
      Scanner userInput = new Scanner(System.in);
      
      System.out.println("type the ship you want to send");
      
      if(userInput.hasNextLine()){
         String typeofShip = userInput.nextLine();
         theEnemyShip = shipFactory.makeEnemyShip(typeofShip);
      }
      if(theEnemyShip!=null)
         doAction(theEnemyShip);
      else {
         System.out.println("please enter the value ");
      }
   }
   
  private static void doAction (EnemyShip enemyShip){
     enemyShip.displayName();
     enemyShip.followTheShip();
  }
   

}
