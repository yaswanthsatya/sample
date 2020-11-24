package com.handson.intrfc;

import java.util.*;

public class LabEx1 implements PhysicalConstants {

	@Override
	public void compute()
	{
		double E,M,F,m1,m2,r,d,t;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter value of M: ");
		M = sc.nextDouble();
		System.out.println("enter value of m1,m2 and r ");
		m1 = sc.nextDouble();
		m2 = sc.nextDouble();
		r = sc.nextDouble();
		System.out.println("enter value of t: ");
		t = sc.nextDouble();
		
		E = M * Math.pow(C, 2);
		F = G * ((m1+m2)/Math.pow(r, 2));
		d = 0.5 * g * t;
		System.out.println("value of E: "+E);
		System.out.println("value of F: "+F);
		System.out.println("value of d: "+d);	
	}
	public static void main(String[] args) 
	{
		LabEx1 l = new LabEx1();
		l.compute();
	}
}
