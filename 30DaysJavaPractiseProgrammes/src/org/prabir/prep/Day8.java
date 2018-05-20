package org.prabir.prep;

import java.util.Scanner;

public class Day8 {
	/*Armstrong Number
	 * sum of cube of each digit of the number  = number -->then armstrong
	*/
	
	public static void main(String[] args) {

		      Scanner sc = new Scanner(System.in);
		      String numb = sc.nextLine();
		      char[] numbArr = numb.toCharArray();
		      int sum =0;
		      for(int i =0 ; i < numbArr.length ; i++){
		          sum += Math.pow(Character.getNumericValue(numbArr[i]),3);
		      }
		      
		      if(sum == Integer.parseInt(numb)){
		          System.out.println(true);
		      }else{
		          System.out.println(false);
		      }

		   }
	}


