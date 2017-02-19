package practice;

import java.util.ArrayList;

public class MaximumAbsoluteDifference {

   public int maxArr(ArrayList<Integer> A) {

      int max = 0;
      int TopMax = 0;

      for (int i = 0; i < A.size(); i++) {
         for (int j = 0; j < A.size(); j++) {
            max = Math.abs(A.get(i) - A.get(j)) + Math.abs(i - j);
            if (max > TopMax)
               TopMax = max;

         }
      }

      return TopMax;
   }

   public static void main(String[] args) {

   }

}
