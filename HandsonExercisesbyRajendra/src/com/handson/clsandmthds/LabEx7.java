package com.handson.clsandmthds;

import java.util.*;
public class LabEx7 {
	public static void main(String args[]) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter first string:");
		String s1=sc.next();
		System.out.print("Enter second string:");
		String s2=sc.next();
		int s1len=s1.length();
		int s2len=s2.length();
		if(s1len==s2len)
		{
			char[] arr1=s1.toCharArray();
			char[] arr2=s2.toCharArray();
			Arrays.sort(arr1);
			Arrays.sort(arr2);
			s1=Arrays.toString(arr1);
			s2=Arrays.toString(arr2);
			if(s1.equalsIgnoreCase(s2))
			{
				System.out.println("Strings are Anagrams");
			}
			else {
				System.out.println("Strings are not Anagrams");
			}
		}
		else {
			System.out.println("Strings are not Anagrams");
		}
	}
}
