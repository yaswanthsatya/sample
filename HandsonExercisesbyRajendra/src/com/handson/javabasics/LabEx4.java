package com.handson.javabasics;

import java.util.*;

public class LabEx4 {
	public static void main(String[] args) {
		double prod1 = 22.50;
		double prod2 = 44.50;
		double prod3 = 9.98;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a product number:");
		int prodnum = sc.nextInt();
		System.out.print("Enter the quantity sold:");
		int quansold = sc.nextInt();
		double totalRetail = 0;
		switch (prodnum) 
		{
			case 1:
				totalRetail += prod1 * quansold;
				break;
			case 2:
				totalRetail += prod2 * quansold;
				break;
			case 3:
				totalRetail += prod3 * quansold;
				break;
			default:
			    System.out.println("Exceptional Case");
		}

		System.out.println("Total Retail value of all products sold:" + totalRetail);

		sc.close();
	}
}