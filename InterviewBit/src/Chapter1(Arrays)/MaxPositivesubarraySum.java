package practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MaxPositivesubarraySum {

   private static ArrayList<Integer> sol(List<Integer> a) {
      long maxSumSoFar = 0, sum = 0;
      ArrayList<Integer> maxArray = new ArrayList<Integer>();
      ArrayList<Integer> newArray = new ArrayList<Integer>();

      for (Integer i : a) {
         if (i < 0) {
            newArray.add(i);
         }
      }
      if (newArray.size() == a.size())
         return maxArray;

      newArray = new ArrayList<Integer>();

      for (Integer i : a) {
         if (i >= 0) {
            sum = i;
            newArray.add(i);

         } else {
            sum = 0;
            newArray = new ArrayList<Integer>();
         }
         if (sum > maxSumSoFar || (sum == maxSumSoFar && newArray.size() >= maxArray.size())) {

            maxSumSoFar = sum;
            maxArray = newArray;
         }
      }
      return maxArray;

   }

   public static void main(String[] args) {
      List<Integer> a = Arrays.asList(336465782, -278722862, -2145174067, 1101513929, 1315634022,
               -1369133069, 1059961393, 628175011, -1131176229, -859484421);

      System.out.println("solution is " + sol(a));

   }
}
