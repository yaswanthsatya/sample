package com.handson.javabasics;

import java.util.Scanner;

public class LabEx5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("please enter number of eggs present :");
		int n = sc.nextInt();
		int gross = n / 144;
		n = n % 144;
		System.out.print("Your number of eggs is " + gross+" gross,");
		int dozen = n / 12;
		n = n % 12;
		System.out.println(dozen+" dozen, "+n);
		
		sc.close();
	}

}
