package com.handson.clsandmthds;

import java.util.*;

public class AppUserMain 
{
	public static void main(String[] args) 
	{	
		Scanner in=new Scanner(System.in);
		for(int i=0;i<2;i++)
		{
			System.out.println("enter the username and password: ");
			String u=in.next();
			String p=in.next();
			AppUser a=new AppUser(u,p);
			a.output();
		}
		in.close();
		//AppUser a=new AppUser();
	}
}
