package com.collectionFramework;

import java.util.ArrayList;
import java.util.List;

public class ListDemo {

	public static void main(String[] args) 
	{
		ArrayList l1 = new ArrayList();
		l1.add(1);
		l1.add(34);
		l1.add(323);
		
		System.out.println(l1);
		
		l1.remove(1);
		l1.removeAll(l1);
		l1.clear();
		
		System.out.println(l1);
		
		l1.addAll("as");
		
	

	}

}
