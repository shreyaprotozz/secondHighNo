package com.demo.secondHighNo.main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args)
	{
		@SuppressWarnings("resource")
		Scanner sc= new Scanner(System.in); 
		System.out.print("Enter a number : ");  
		String digits= sc.nextLine();             
		SecondHighNo secondHighNumber = new SecondHighNo();
		char higherNum []=secondHighNumber.findHighNumber(digits);
	}
}
