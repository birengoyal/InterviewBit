package practice;

import java.util.Arrays;
import java.util.List;

public class BiggestNumber {

   public static void main(String[] args) {
      List<Integer> arr =  Arrays.asList(8,89);
      printArray(arr);
      arrange(arr);
   }

   private static void arrange(List<Integer> arr) {

      int n = arr.size();
      Integer[] arr1 = new Integer[n];
      for (int i = 0; i < arr.size(); i++) {
         arr1[i] = arr.get(i);
      }

      Arrays.sort(arr1, new MyComparator());

      for (int i = 0; i < n; i++) {
         arr.set(i, arr1[i]);
      }
      for (int i = 0; i < n; i++) {
         System.out.print(arr.get(i));
      }
   }

   private static void printArray(List<Integer> arr) {
      for (int i = 0; i < arr.size(); i++) {
         System.out.print(arr.get(i) + " ");
      }
      System.out.println();
   }

   
   
}
