package practiceDesignPatternStrategy;

public class Add implements OperationStrategy{

   @Override
   public int doOperation(int a, int b) {
      int c ;
      c = a+b;
      
      return c;
   }

}
