package com.ibm.technical;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ConsoleInput {

	public static void main(String[] args) throws IOException 
	{
		int rollNumber;
		String name;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter ROll number");
		rollNumber = Integer.parseInt(br.readLine());
		System.out.println("Enter the name");
		name =br.readLine();
		
		System.out.println("Roll Number"+ rollNumber);
		System.out.println("Name is "+name);
		
		

	}

}
