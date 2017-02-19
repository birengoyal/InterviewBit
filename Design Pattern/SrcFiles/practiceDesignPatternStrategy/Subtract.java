package practiceDesignPatternStrategy;

public class Subtract implements OperationStrategy{

   @Override
   public int doOperation(int a, int b) {
       int c ;
       c= a-b;
       return c;
             
   }

}
