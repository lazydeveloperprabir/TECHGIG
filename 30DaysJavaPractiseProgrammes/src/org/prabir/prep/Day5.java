package org.prabir.prep;

import java.util.Scanner;

public class Day5 {

	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int num =  sc.nextInt();
        if(num == 0 || num == 1 || num == 2 ){
            System.out.println(num);
        }else {
        int factorial = 1;    
        for(int i = 2 ; i <= num ; i++){
            factorial *= i;
        }
        System.out.println(factorial);
        }

	}
}
