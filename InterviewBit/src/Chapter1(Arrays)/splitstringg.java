package practice;

public class splitstringg {
   
   public static void main(String[] args) {
      String str = "Txn Id :0FELxBafosDr82_10067964_1 Txn type :CANCELLATION_REFUND isTerminalState :false lockReminderCount :1 lockReminderMaxCount :10 messageId:24c8f4ec-5bf8-59f1-9d0a-a40292530b47 child Task Id: LOCK_REMINDER_TASK.1484057835105_0FELxBafosDr82_10067964_1_CANCELLATION_REFUND_1:TSM:2";
      String delimiters = "Task Id :|isTerminalState :|lockReminderCount|messageId:| child Task Id:";

      // analyzing the string
      String[] tokensVal = str.split(delimiters);

      // prints the count of tokens
      System.out.println("Count of tokens = " + tokensVal.length);
       
      for(String token : tokensVal) {
      System.out.print(token);
      System.out.println();
      System.out.println();
      System.out.println();
      } 
   }

}
