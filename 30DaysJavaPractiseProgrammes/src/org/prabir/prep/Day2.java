package org.prabir.prep;

import java.util.Scanner;

public class Day2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 Scanner sc = new Scanner(System.in);
	     String st =  sc.next();
    
	     if(st.matches("\\D+")) {
	    	   System.out.println("This input is of type string.");
	     } else if(isInteger(st)) {
 	 		System.out.println("This input is of type Integer.");
 	 	} else if(isFloat(st)) {
	 		System.out.println("This input is of type Float.");
	 	}else {
	 		System.out.println("This is something else.");
	 	}
	}
	
	public static boolean isInteger(String str) {
		try {
			Integer.parseInt(str);
			return true;
		}catch(NumberFormatException ne) {
			return false;
		}
	}
	
	public static boolean isFloat(String str) {
		try {
			Float.parseFloat(str);
			return true;
		}catch(NumberFormatException ne) {
			return false;
		}
	}

}
