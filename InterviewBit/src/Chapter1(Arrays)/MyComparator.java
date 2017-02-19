package practice;

import java.util.Comparator;

public class MyComparator implements Comparator<Integer> {

   @Override
   public int compare(Integer o1, Integer o2) {
      String s1 = o1.toString() + o2.toString();
      String s2 = o2.toString() + o1.toString();
      if (s1.compareTo(s2) > 0)
         return -1;
      else {
         return 1;
      }
   }

}
