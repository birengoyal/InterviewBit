package practiceDesignPatternStrategy;

public class Context {

   private OperationStrategy strategy;

   public void setStrategy(OperationStrategy strategy) {
      this.strategy = strategy;
   }
   
   public int executeStrategy(int i, int j){
      return strategy.doOperation(i, j);
   }
   
   
}
