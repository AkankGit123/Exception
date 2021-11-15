package com.rays.Exception;

public class ExceptionHand {
	
public static void main(String[] args) {
		
		int i = 15;
		int k = 0;
		String name = "Vijay";
		try
		{
			System.out.println(name.charAt(7));
			double d = i/k;
			System.out.println(d);
			
		}
		catch(RuntimeException a) {
			a.printStackTrace();
			System.out.println(a.getMessage());
		}
		

}}
