package practice;

import java.util.List;


public class MaxSumContigousSubarray {

   //private static int MIN_LIMIT = -1000;

   private static int sol(int[] a) {
      int maxSumSoFar = 0, sum = 0;
      for (int i = 0; i < a.length; i++) {
         
         sum += a[i];
         if (sum < 0) {
            sum = 0;
         }
         if (sum > maxSumSoFar) {
            maxSumSoFar = sum;
         }
      }
      return maxSumSoFar;
   }

   public static void main(String[] args) {
      int[] a = {-2,-3,4,-1,-2,1,5,-3};
      System.out.println("solution is " + sol(a));

   }

}
