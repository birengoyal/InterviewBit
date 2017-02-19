package practiceDesignFactoryPattern;

public class EnemyShipFactory {

   public EnemyShip makeEnemyShip(String enemyshipName) {

      if (enemyshipName.equals("B"))
         return new BigRocketEnemyShip();
      else if (enemyshipName.equals("R"))
         return new RocketEnemyShip();
      else if (enemyshipName.equals("U"))
         return new UFOEnemyShip();
      else
         return null;

   }
}
