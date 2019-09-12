package com.mia;

import java.util.Scanner;

public class MainClass {



	 public static void main(String args[]) 
	    { 
			RomanNumbers romanNumbers = new RomanNumbers();
			
			//Here we put some test case with static input, using string array.
		 	//For negative testing, we can key in uppercase and lowcase letter randomly, as well as null value. 	
		 	String[] inputArray1 = {"pish", "teGj","glob","glob"};
		 	String[] inputArray2 = {"glob", "ProK","silVER"};
		 	String[] inputArray3 = {"GLOB", "prok","gold"};
		 	String[] inputArray4 = {"GLOB", "prok","iRON"};
		 	String[] inputArray5 = {"would", "could a","woodchuck","if a wood","chuck","chuck"};
	    	
	    	//This part we will call the conversion algorithm to convert intergalactic units, based on romanian numbers rules.
	    	//We'll try to pass all the test case to the RomanNumbers class where there is method will process it, called "processRomanNumber".
	    	System.out.println("Output :");
	    	romanNumbers.processRomanNumber(inputArray1);
	    	romanNumbers.processRomanNumber(inputArray2);
	    	romanNumbers.processRomanNumber(inputArray3);
	    	romanNumbers.processRomanNumber(inputArray4);
	    	romanNumbers.processRomanNumber(inputArray5);
	    	
	    	//Second case for input value, let say we want to insert dynamic data for our testing.
	    	//We are using scanner, so user will be able to type the testing data in the console.
	    	//We call the same method to process the conversion.
	    	System.out.println("\nPlease enter your dynamic input  ");
	    	Scanner sc = new Scanner(System.in);
	        String dynamic1 = sc.nextLine(); 
	        String dynamic2 = sc.nextLine(); 
	        String dynamic3 = sc.nextLine(); 
	    	String[] inputArray6 = {dynamic1, dynamic2,dynamic3};
	    	System.out.println("\nYour dynamic input result as per below ");
	    	romanNumbers.processRomanNumber(inputArray6);
	    	
	    	}
}
