package com.handson.inhrtnc;

import java.util.*;

public class LabEx9
{
	public static void main(String args[])
	{
		Orcle arr[]= new Orcle[1];
		try{
			for(int i=0;i<arr.length;i++)
			{
				Scanner s=new Scanner(System.in);
				System.out.println("Enter username :");
				String username=s.nextLine();
				System.out.println("Enter Password");
				String password=s.nextLine();
				System.out.println("Enter Url");
				String url=s.nextLine();
				arr[i] = new Orcle(username,password,url);
			}
		}
		catch(Exception e)
		{
			System.out.println("Number of objects are limited to 10");

		}
		for(int i=0;i<arr.length;i++)
			arr[i].printall();

	}
}
class Orcle
{
	static int noOfObjects = 0;  
	{ 
		noOfObjects += 1; 
	}
	String username;
	String password;
	String url;

	Orcle(String username, String password, String url)
	{
		this.username = username;
		this.password = password;
		this.url = url;
	}

	String getUsername()
	{
		return username;
	}
	void setUsername(String username)
	{
		this.username = username;
	}
	String getPassword()
	{
		return password;
	}
	void setPassword(String username)
	{
		this.password = password;
	}
	String getURL()
	{
		return url;
	}
	void setURL(String username){
		this.url = url;
	}

	void printall()
	{
		String pw="";
		System.out.println("username: "+username);
		for(int i=0;i<password.length();i++)
			pw=pw+"*";
		System.out.println("password: "+pw);
		System.out.println("URL: "+url);
		System.out.println(noOfObjects);

	}

}
