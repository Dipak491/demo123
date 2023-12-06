package com.main;

//public class Demo1 
//{
//	public void area(int l, int b)
//	{
//		System.out.println("Area is "+(l*b));
//	}
//		
//}

class Abc
{
	public int Armstrong(int num)
	{
//		int num = 121;
		int temp = num;
		int rem = 0;
		int result =0;
		int i =0;
		
		while(i < temp)
		{
			rem = temp % 10;
			temp = temp / 10;
			result = result + (rem*rem*rem);
			
			i++;	
			
		}
		
		System.out.println(" result "+result);
		return result;
		
 	}
	
}

	public class Same
		{
			public static void main(String[] args) {
				
				Abc obj = new Abc();
				obj.Armstrong(121);
				
		
			}
		}
