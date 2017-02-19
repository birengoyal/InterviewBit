package practice;

import java.util.ArrayList;

public class solution {

   public static void main(String[] args) {
      ArrayList<Integer> A = new ArrayList<Integer>();
      A.add(1);
      A.add(2);
      A.add(3);
      A.add(4);
      A.add(5);

      int B = 7;
      ArrayList<Integer> ret = new ArrayList<Integer>();
      if (B > A.size())
         B =   B%A.size();
      for (int i = B; i < A.size(); i++) {
         ret.add(A.get(i));
      }
      for (int i = 0; i < B ; i++)
         ret.add(A.get(i));
      System.out.println(ret);

      System.out.println("");
      // System.out.println(rota);
   }

}
