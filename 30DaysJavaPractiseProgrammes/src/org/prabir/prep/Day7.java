package org.prabir.prep;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Day7 {
	
	/*
	 * Prime Number
	 * If number = 1  => not prime
	 * If number >= 2 ==> num% i != 0 then prime
	 * where 2<=i<=num
*/
	public static void main(String args[] ) throws Exception {

        Scanner sc = new Scanner(System.in);
        int startNum =  sc.nextInt();
        int endNum =  sc.nextInt();
        List<Integer> primeNumList = new ArrayList<>();
        for(int index = startNum ; index <= endNum; index++){
         	if(isPrime(index)){
                primeNumList.add(index);
            }
        }  
        System.out.println(primeNumList.size());
    

   }
   
   
   static boolean isPrime(int n)
   {
       // Corner case
       if (n <= 1)
           return false;
     
       // Check from 2 to n-1
       for (int i = 2; i < n; i++)
           if (n % i == 0)
               return false;
     
       return true;
   }

}
