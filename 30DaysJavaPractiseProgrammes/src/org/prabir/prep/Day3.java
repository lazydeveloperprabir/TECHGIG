package org.prabir.prep;

import java.util.Scanner;

public class Day3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	     Double principal = sc.nextDouble();
	     Integer intrest = sc.nextInt();
	     Integer year = sc.nextInt();
	     System.out.println(Math.round((principal * intrest * year)/100));
	}

}
