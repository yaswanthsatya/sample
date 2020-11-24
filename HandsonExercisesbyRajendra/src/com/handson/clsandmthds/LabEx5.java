package com.handson.clsandmthds;

import java.util.*;
public class LabEx5 {
	public static void main(String args[])
	{
		String str="The quick brown fox jumps over the lazy dog";
		System.out.println(str);
		//To get the character at index12
		int index1=str.charAt(12);
		System.out.println("The character at index 12 is " + (char)index1);
		//if string contains word "is"
		if(str.contains("is")) {
			System.out.println("is found");
		}
		else {
			System.out.println("is not found");
		}
		//to concatenate string
		str=str.concat(" and killed it");
		System.out.println(str);
		//whether ends with dogs
		boolean b=str.endsWith("dogs");
		System.out.println(b);
		//whether string is equal to "The quick brown Fox jumps over the lazy Dog"
		CharSequence cs1="The quick brown Fox jumps over the lazy Dog";
		System.out.println(str.contentEquals(cs1));
		//whether string is equal to "THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG"
		CharSequence cs2="THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG";
		System.out.println(str.contentEquals(cs2));
		//length of string
		System.out.println("length of string is :"+str.length());
		//
		//Replace "The" with "A"
		 System.out.println("After replacing: "+str.replace("The","A"));
        //
		//12.to lowercase
		  System.out.println(str.toLowerCase());
		//13.to uppercase
		  System.out.println(str.toUpperCase());
		//14.find index of "a"
		  System.out.println("Index of a in str: "+str.indexOf('a'));
		//15.last index position of "e"
		  System.out.println("Last 'e' in str1: "+str.lastIndexOf('e'));

	}

}
