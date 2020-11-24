package com.handson.inhrtnc;

public class Calculator 
{
	int add(int a,int b)
	{
		return a+b; 
	}
	int dif(int a, int b)
	{
		return a-b;
	}
	int mult(int a,int b)
	{
		return a*b;
	}
	int div(int a, int b)
	{
		return a/b;
	}
	
	//-------------------------------------------------------------------
	
	double add(double a,double b)
	{
		return a+b;
	}
	
	double dif(double a, double b)
	{
		return a-b;
	}

	double mult(double a,double b)
	{
		return a*b;
	}
	
	double div(double a, double b)
	{
		return a/b;
	}
	
	//----------------------------------------------------------
	
	double add(int a,double b)
	{
		return a+b;
	}
	
	double dif(int a, double b)
	{
		return a-b;
	}

	double mult(int a,double b)
	{
		return a*b;
	}
	
	double div(int a, double b)
	{
		return a/b;
	}
	
	//-------------------------------------------------------
	
	
	double add(double a,int b)
	{
		return a+b;
	}
	
	double dif(double a, int b)
	{
		return a-b;
	}

	double mult(double a,int b)
	{
		return a*b;
	}
	
	double div(double a, int b)
	{
		return a/b;
	}
	
	
	public static void main(String[] args) 
	{
		Calculator c = new Calculator();
		
		System.out.println(c.dif(15, 5));
		System.out.println(c.add(15, 5));
		System.out.println(c.mult(15, 5));
		System.out.println(c.div(15, 5));
	//------------------------------------------------
		System.out.println(c.add(15.1, 5.5));
		System.out.println(c.dif(15.1, 5.5));
		System.out.println(c.mult(15.1, 5.5));
		System.out.println(c.div(15.1, 5.5));
	//---------------------------------------------
		System.out.println(c.add(15, 5.5));
		System.out.println(c.dif(15, 5.5));
		System.out.println(c.mult(15, 5.5));
		System.out.println(c.div(15, 5.5));
	//----------------------------------------------
		System.out.println(c.add(15.1, 5));
		System.out.println(c.dif(15.1, 5));
		System.out.println(c.mult(15.1, 5));
		System.out.println(c.div(15.1, 5));

	}
	
}
