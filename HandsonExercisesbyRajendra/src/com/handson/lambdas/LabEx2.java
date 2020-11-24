package com.handson.lambdas;

import java.util.Scanner;

@FunctionalInterface
interface TwoStringPredicate
{
	boolean  betterString(String str1,String str2);
}

public class LabEx2 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Strings");
		String str1=sc.next();
		String str2=sc.next();
		boolean str= method((sval1, sval2)->
		{
			if(str1.length()>str2.length())
			{
				return true;
			}
			return false;			
		},str1,str2);
		if(str)
		{
			System.out.println(str1);
		}else
		{
			System.out.println(str2);				
		}
		sc.close();
	}
	private static boolean method(TwoStringPredicate obj,String str1,String str2) 
	{		
		return obj.betterString(str1, str2);
	}
}
