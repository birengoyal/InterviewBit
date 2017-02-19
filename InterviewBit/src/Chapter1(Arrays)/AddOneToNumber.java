package practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AddOneToNumber {

   public static ArrayList<Integer> solution(List<Integer> a) {
      int carry = 1;
      ArrayList<Integer> result = new ArrayList<>(a);
      int len = a.size();
      for (int i = len - 1; i >= 0; i--) {
         if (carry == 0) {
            break;
         }

         int digit = a.get(i);
         int finalDigit = digit + carry;
         if (finalDigit >= 10) {
            carry = finalDigit / 10;
            digit = finalDigit % 10;
         } else {
            carry = 0;
            digit = finalDigit;
         }
         result.set(i, digit);
      }

      if (carry != 0) {
         result.add(0, 1);
      }

      int j = 0;

      while (j < result.size() && result.get(j) == 0) {
         result.remove(j);
      }

      return result;
   }
   
   public static void main(String[] args) {
      List<Integer> a = Arrays.asList(3, 1, 1, 9, 9);
      System.out.println(solution(a));
   }
}
