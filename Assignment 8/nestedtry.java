package com.tns.Exceptions;

public class WithoutException {
	public static void main(String args[]) {
		
		int d = 0;
		try{
			int b = 12;
			System.out.println(b + 12);
			try{
				int a = 42/d;
			}
			catch(NullPointerException e){
				System.out.println("exception caught"+e.getMessage());
			}
		}
		catch(ArithmeticException e){
			System.out.println("exception caught"+e.getMessage());
		}
		System.out.println("Will not be printed .");
	}
}