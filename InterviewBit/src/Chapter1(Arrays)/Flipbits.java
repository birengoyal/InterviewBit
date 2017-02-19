package practice;

import java.util.Scanner;


class Flipbits {
    
    private int getMaximumNumberAfterFlips(int[] inputNumber)
    {
        int totalSum = 0, tempSum = 0, startIndex = 0, tempStart = 0, endIndex = 0, count = 0;
        
        for(int i = 0; i < inputNumber.length; i++)
        {
           if(inputNumber[i] == 1)
           {
               count++;
               inputNumber[i] = -1;
           }
           else
           {
               inputNumber[i] = 1;
           }
           
           tempSum = tempSum + inputNumber[i];
           
           if(tempSum < 0)
           {
               tempSum = 0;
               tempStart = i + 1;
           }
           else if(totalSum < tempSum)
           {
               totalSum = tempSum;
               startIndex = tempStart;
               endIndex = i;
           }
        }
        totalSum = totalSum + count;
        return totalSum;
    }
    
   public static void main (String[] args) {
      int totalNumberOfTestCases, sizeOfN, bitElements[], maximumNumber;
      Flipbits gfg = new Flipbits();
      Scanner sc = new Scanner(System.in);
      totalNumberOfTestCases = sc.nextInt();
      
      for(int i = 0; i < totalNumberOfTestCases; i++)
      {
          sizeOfN = sc.nextInt();
          bitElements = new int[sizeOfN];
          
          for(int j = 0; j < sizeOfN; j++)
          {
              bitElements[j] = sc.nextInt();
          }
          maximumNumber = gfg.getMaximumNumberAfterFlips(bitElements);
          System.out.println(maximumNumber);
      }
   }
}