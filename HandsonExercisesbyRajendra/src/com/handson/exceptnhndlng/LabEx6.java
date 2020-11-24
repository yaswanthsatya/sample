package com.handson.exceptnhndlng;

import java.util.*;

public class LabEx6 
{
	public static void main(String[] args) 
	{
		List<String> names= new ArrayList<>();
		boolean value=true;
		
		while(value)
		{
			try 
			{
				Scanner sc= new Scanner(System.in);
				System.out.println("Enter the name:");
				String name=sc.nextLine();
				System.out.println("Enter the age:");
				int age=sc.nextInt();
				int c=Collections.frequency(names, name);
				int d;
				if(c!=0)
					throw new Exception("User Existed");
				else if(age < 0 || age<18 || age>60)
					throw new Exception("Age is Invalid");
				System.out.println("Hello "+name);
				names.add(name);

			}
			catch (InputMismatchException e) 
			{
				System.out.print("Input mismatch Exception occured");
				value=false;
			}
			catch (NumberFormatException  e) 
			{
				System.out.print("Number format Exception occured");
				value=false;

			}
			catch(Exception e)
			{
				System.out.println(e);
				value=false;
			}
		}
		System.out.println(names);
	}

}
