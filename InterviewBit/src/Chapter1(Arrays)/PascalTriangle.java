package practice;

import java.util.ArrayList;

public class PascalTriangle {

   public static ArrayList<ArrayList<Integer>> solution(int a) {

      ArrayList<Integer> pre = new ArrayList<Integer>();
      ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();

      for (int i = 0; i < a; i++) {
         int number = 1;
         pre = new ArrayList<Integer>();
         for (int j = 0; j <= i; j++) {
            pre.add(number);
            number = number * (i-j)/(j+1);
         }
         result.add(pre);
      }
      return result;
   }
   
   public static void main(String[] args) {
      
      int a = 5;
      System.out.println(solution(a));
   }

}
