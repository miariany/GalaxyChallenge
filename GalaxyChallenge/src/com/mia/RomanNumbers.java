package com.mia;

import java.util.Scanner;

public class RomanNumbers extends Conversion{

	//Calling conversion object
	Conversion conversion = new Conversion();
	//Initialize credit variable in Integer data type
	int credit;
	//Initialize flag as boolean data type
	boolean flag;
	
	public void processRomanNumber(String [] unit) 
	    { 
			//Assign intial value for credit variable as 0.
		    credit = 0; 
		    //Flag will use as a mark if the data given was wrong.
		    flag = false;
		    
	        //Here we start the statements with "try" block, one set with catch exception.
	        //We need to block our statements to prevent an error occur during the process. 
	        try{
	        	
	        	//Looping based on array length
	            for (int k=0; k<unit.length; k++) 
	            { 
	            	// Calling class Conversion to process unit conversion. Will call method convertRoman and pass in parameter from array list one by one
	            	// Let say 1st data is "pish", here we pass in convertRoman(pish)
	                int currentData = conversion.convertRoman(unit[k]);
	                // Then assign the return data to "currentData" variable
	                	                
	                //This condition to handle if the return credit/conversion value equals to 0
	                //We'll mark the given data as wrong input
	                if(currentData==0){
	                	//flag is true if currentData is 0
	                	flag = true;
	                	//stop the process
	                	break;
	                }
	                
	                //If current data not equals to 0. Will continue to below condition.
	                //if array length bigger than current index+1 will go into this condition
	                //Example length=3 > 0+1
	                //This condition to check whether next unit/number is smaller then current number 
	                if (unit.length > k+1) 
	                { 
	                	//Conversion next data
	                    int nextData = conversion.convertRoman(unit[k+1]); 
	                    
	                    //condition to check if smaller data precede larger data / value of nextData bigger than currentData
	                    if (nextData > currentData) 
	                    { 
	                    	//if yes, then smaller value will subtract from larger value
	                    	//the subtracted value added to total/credit
	                    	credit = credit + nextData - currentData; 
	                    	//then increase looping index
	                        k++; 
	                    } 
	                    //condition for nextData smaller/equals to currentData.
	                    else if(nextData <= currentData)
	                    { 
	                    	//add the credit value
	                    	credit = credit + currentData;
	                    } 
	                } 
	                //for last index in the array will go to this condition
	                else if(unit.length == k+1)
	                { 
	                	//add the credit value
	                	credit = credit + currentData; 
	                	//increase index value
	                    k++; 
	                } 
	            } 
	            
	            //This condition will trigger upon flag variable is true.
	            //Because data given is wrong/mismatch unit conversion
	            if(flag){
	            	System.out.println("I have no 1d34 wh47 4R3 y0u t4lk1n9 a80u7 - Alien");
	            }
	            //Else condition for correct/match data
	            else{
	            	//To replace comma from array with space
	            	//Join the array elements together
	            	System.out.println(String.join(" ", unit)+" "+ credit + " credits");
	            }
	        }
	        //Handler : Multiple catch block 
	        //Catch block that can handle NullPointerException
	        catch(NullPointerException e){
	        	System.out.println("NullPointerException occured");
	        }
	        //Catch error from certain statements that possible throw an exception. 
	        catch(Exception e){
	        	System.out.println("Exception occurred");
	        }
	    } 

}
