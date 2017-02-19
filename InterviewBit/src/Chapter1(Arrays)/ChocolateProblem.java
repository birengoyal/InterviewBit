package practice;

import java.util.Arrays;
import java.util.Comparator;

public class ChocolateProblem {

   private static final int INT_MAX = 1000000;

   public static int findMinDiff(int[] arr, int n, int m) {
      if (n < m || n == 0 || m == 0)
         return 0;
      int first = 0;
      int second = 0;
      Arrays.sort(arr);
      int min_diff = INT_MAX;
      for (int i = 0; i + m - 1 < n; i++) {
         int diff = arr[i + m - 1] - arr[i];
         if (min_diff > diff) {
            min_diff = diff;
            first = i;
            second = i + m - 1;
         }
      }
      return arr[second] - arr[first];
   }

   public static void main(String[] args) {
      int arr[] = {7, 3, 2, 4, 9, 12, 56};
      int m = 3; // Number of students
      int n = arr.length;
      System.out.println("min difference is " + findMinDiff(arr, n, m));
   }

}
