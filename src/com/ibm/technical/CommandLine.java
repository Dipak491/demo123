package com.ibm.technical;

public class CommandLine {
	public static void main(String[] args) {
		
		try
		{
		int a,b,c;
		a = Integer.parseInt(args[0]);
		b = Integer.parseInt(args[1]);
		c = a + b;
		
		
		System.out.println("Addition is "+c);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

}
// Run application wt command line argument 
//CLick run as a run configuration 
// click arguments n pass value and apply Run 

