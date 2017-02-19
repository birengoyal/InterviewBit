package practice;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class FindDuplicateInArray {
   
   
   public static int solution(List<Integer> a) {
      long len = a.size();
      HashSet<Integer> hashSet = new HashSet<Integer>();
      for (int i = 0; i < a.size(); i++) {
         if(!hashSet.add(a.get(i)))
         return a.get(i);
      }
      return 0;
   }
   
   public static void main(String[] args) {
      List<Integer> a = Arrays.asList(3, 1, 2, 5,5, 3);
      System.out.println(solution(a));
   }

}
