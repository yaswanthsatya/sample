package com.handson.javabasics;

import java.util.Scanner;

public class LabEx3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("please enter your categeory to know about the tax slabs.for General enter 'G' and for Women enter 'F' ");
        char c  = sc.next().charAt(0);
        if(c == 'G')
        {
        	System.out.println("please enter you valuable salary :");
        	int sal = sc.nextInt();
        	if(sal > 0 && sal <= 180000)
        		System.out.println("you are exempted from tax slabs");
        	if(sal >= 180001 && sal <= 500000)
        		System.out.println("you have to pay 10% from yor income");
        	if(sal >= 500001 && sal <= 800000)
        		System.out.println("you have to pay 20% from yor income");
        	if(sal > 800000)
        		System.out.println("you have to pay 30% from yor income");
        }
        else if(c == 'F')
        {
        	System.out.println("please enter you valuable salary :");
        	int sal = sc.nextInt();
        	if(sal > 0 && sal <= 190000)
        		System.out.println("you are exempted from tax slabs");
        	if(sal >= 190001 && sal <= 500000)
        		System.out.println("you have to pay 10% from yor income");
        	if(sal >= 500001 && sal <= 800000)
        		System.out.println("you have to pay 20% from yor income");
        	if(sal > 800000)
        		System.out.println("you have to pay 30% from yor income");	
        }
        else 
        	System.out.println("you are choosing other than 'G' or 'F' ");
        
        sc.close();
   
	}
}
