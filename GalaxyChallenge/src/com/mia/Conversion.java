package com.mia;

public class Conversion {

	//Initialize unit name with String data type
	public String  glob= "glob" ;
	public String prok = "prok";
	public String pish = "pish";
	public String tegj = "tegj";
	public String silver = "silver";
	public String gold = "gold";
	public String iron = "iron";
	//Initialize default credit value=0
	int convertValue;
	
	//A method called convertRoman, with access type is public and will return result data with Integer data type.
    //This method will convert each unit code to credits value it worth for.
    //To help us calculate appropriate amount of each unit that we can buy/sell.    
	public int convertRoman(String str) {

		//Initialize default credit value=0
		convertValue=0;
    	//Start checking string parameter that given from method processRomanNumber
    	//First validation, comparing str value with unit name we had in this method
    	//We will handle random letter case by using equalsIgnoreCase function from java
    	//For example data given is "PiSh" will equals to "pish". 
    	//But, if the data given is "p15h" which contain number we'll consider as wrong unit data
    	
    	//Condition to compare glob unit name with given data
    	if(glob.equalsIgnoreCase(str)){
    		//If meet above condition will go to this line
    		//Assign data given to the correct "glob" spelling
    		str=glob;
    		//Assign credit value = 1 to this glob unit
    		convertValue =  1;   		
    	}
    	//If not meet the first condition will check to else condition. Comparing prok unit name with given data
    	else if(prok.equalsIgnoreCase(str)){
    		//If meet above condition will go to this line
    		//Assign data given to the correct "prok" spelling
    		str=prok;
    		//Assign credit value = 5 to this glob unit
    		convertValue = 5;
    	}
    	//If not meet the first and second condition will check to other else condition. Comparing pish unit name with given data
    	else if(pish.equalsIgnoreCase(str)){
    		//If meet above condition will go to this line
    		//Assign data given to the correct "pish" spelling
    		str=pish;
    		//Assign credit value = 10 to this glob unit
    		convertValue = 10;
    	}
    	//If not meet the first, second, and third condition will check to other else condition below.
    	else if(tegj.equalsIgnoreCase(str)){
    		str=tegj;
    		convertValue = 50;
    	}
    	else if(silver.equalsIgnoreCase(str)){
    		str=silver;
    		convertValue = 64;
    	}
    	else if(gold.equalsIgnoreCase(str)){
    		str=gold; 
    		convertValue = 57796;
    	}
    	else if(iron.equalsIgnoreCase(str)){
    		str=iron; 
    		convertValue = 778;
    	}
    	else{
    		convertValue = 0;
    	}
    	
    	return convertValue;
    	
	}

}
