package org.prabir.prep;

import java.util.Scanner;

public class Day9 {

	public static void main(String[] args) {
		//In number theory, a narcissistic number is a number that is the sum of its own digits each raised to the power of the number of digits.
		//eg 153 = 1^3 +5^3 + 3^3
		
		 Scanner sc = new Scanner(System.in);
	      String numb = sc.nextLine();
	      char[] numbArr = numb.toCharArray();
	      int sum =0;
	      for(int i =0 ; i < numbArr.length ; i++){
	          sum += Math.pow(Character.getNumericValue(numbArr[i]),numbArr.length);
	      }
	      
	      if(sum == Integer.parseInt(numb)){
	          System.out.println("True");
	      }else{
	          System.out.println("False");
	      }

	}

}
