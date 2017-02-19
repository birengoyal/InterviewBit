package practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RepeatNMissingNNumber {

   public static ArrayList<Integer> solution(List<Integer> a) {
      long len = a.size();

      long sumOfN = (len * (len + 1)) / 2;
      long sumOfNSq = (len * (len + 1) * (2 * len + 1)) / 6;

      for (int i = 0; i < len; i++) {
         sumOfN -= (long)a.get(i);
         sumOfNSq -= (long)(a.get(i) * (long)a.get(i));
      }
      long repeatedNum =  (sumOfN + sumOfNSq / sumOfN) / 2;
      long missingNum =  (repeatedNum - sumOfN);

      ArrayList<Integer> result = new ArrayList<Integer>();
      result.add((int) missingNum);
      result.add((int)repeatedNum);

      return result;
   }

   public static void main(String[] args) {
      System.out.println("RepeatNMissingNNumber");
      List<Integer> a = Arrays.asList(3, 1, 2, 5, 3);
      System.out.println(solution(a));
   }

}
