package com.handson.javabasics;

import java.util.Scanner;

public class LAbEx2 {

	public static void main(String[] args) {
		//a
		
		int a,b;
		System.out.println("please enter two values");
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		b = sc.nextInt();
		System.out.println("before swaping "+a+" "+b);
		a = a + b;
		b = a - b;
		a = a - b;
		
		System.out.println("after swaping "+a+" "+b);
		
		// b
		
		int year;
		System.out.println("enter a year to check whethter it is leap or not");
		year = sc.nextInt();
		if(((year % 4 == 0) && (year % 100!= 0)) || (year%400 == 0))
			System.out.println("leap year");
		else
			System.out.println("not leap year");
		
		sc.close();
		
	}

}
