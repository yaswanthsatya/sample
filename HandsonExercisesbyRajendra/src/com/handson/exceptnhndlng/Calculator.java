package com.handson.exceptnhndlng;

import java.util.*;

public class Calculator 
{
	void add()
	{
		try
		{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter value of a");
		int a = sc.nextInt();
		System.out.println("Enter value of b");
		int b = sc.nextInt();
		System.out.println(a+b);
		}
		catch(InputMismatchException e)
		{
			System.err.println("Input mismatch exception caught");
			add();
		}	
	}
	void div()
	{
		try
		{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter value of c");
		int c = sc.nextInt();
		System.out.println("Enter value of d");
		int d = sc.nextInt();
		System.out.println(c/d);
		}
		catch(ArithmeticException e)
		{
			System.err.println("arithmetic exception caught");
			div();
		}
	}

	public static void main(String[] args) 
	{
		Calculator calc = new Calculator();	
		calc.add();
		calc.div();
	}
}
