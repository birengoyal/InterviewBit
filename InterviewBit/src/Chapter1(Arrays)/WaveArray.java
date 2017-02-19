package practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class WaveArray {

   public static ArrayList<Integer> solution(List<Integer> a) {

      int size = a.size();
      for (int i = 0; i < size; i+=2) {

         if (i>0 &&  a.get(i)< a.get(i - 1)) {
            swap(a, i, i - 1);
         }
         if (i<size-1 && a.get(i) < a.get(i + 1)) {
            swap(a, i, i + 1);

         }

      }
      ArrayList<Integer> result = new ArrayList<Integer>();
      for (int i = 0; i < a.size(); i++) {
         result.add(i, a.get(i));
      }

      return result;
   }

   private static void swap(List<Integer> a, int cur_index, int integer) {
      int temp;
      temp = a.get(cur_index);
      a.set(cur_index, a.get(integer));
      a.set(integer, temp);
   }

   public static void main(String[] args) {
      List<Integer> a = Arrays.asList(10, 90, 49, 2, 1, 5, 23);
      System.out.println(solution(a));
   }

}
