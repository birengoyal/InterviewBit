package practiceDesignFactoryPattern;

public abstract class EnemyShip {

   private String name;
   private double speed;
   private double damage;
   
   public void setName(String newName){
      name = newName;
   }
   
   public double getSpeed() {
      return speed;
   }

   public void setSpeed(double speed) {
      this.speed = speed;
   }

   public double getDamage() {
      return damage;
   }

   public void setDamage(double damage) {
      this.damage = damage;
   }

   public String getName() {
      return name;
   }
   
   public void followTheShip(){
      System.out.println( getName() +"is following the hero ship ");
   }
   
   public void displayName(){
      System.out.println( getName()+" is  the ship name ");
   }
   
}
