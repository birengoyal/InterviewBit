package practiceDesignPatternStrategy;

public class MainClass {

   
   public static void main(String[] args) {
      Context context = new Context();
      context.setStrategy(new Subtract());
      System.out.println(context.executeStrategy(1, 4));
   }
}
