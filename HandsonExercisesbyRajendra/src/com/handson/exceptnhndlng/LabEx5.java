package com.handson.exceptnhndlng;

import java.util.InputMismatchException;
import java.util.Scanner;

public class LabEx5 
{
		public static void main(String args[]) 
		{
	    	//Scanner sc=new Scanner(System.in);
			StringBuilder b=new StringBuilder();
			try
			{
				
				b.append("hello!! ");
				b.append("welcome to the Corporate World");
				System.out.println(b);
			}
			catch(InputMismatchException e)
			{
				System.out.println("error");
				
			}
			finally
			{
				b=null;
				System.out.print(b);
				
			}
		}

}
