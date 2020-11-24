package com.handson.clsandmthds;

import java.util.Scanner;

public class LabEx9
{
	public int generatePassword(int unicode[],int n)
	{
		for(int i=0;i<n;i++)
		{
			int tmp=unicode[i];
			int revnum=0;
			while(tmp>0)
			{
				int t=tmp%10;
				revnum=(revnum*10)+t;
				tmp=tmp/10;
			}
			unicode[i]=revnum;
		}
		String numstr="";
		for(int i=0;i<n;i++)
		{
			String tmp=Integer.toString(unicode[i]);
			numstr=numstr.concat(tmp);
		}
		int combno= Integer.parseInt(numstr);
		while(combno>99999) {
			combno=combno/5;
		}
		return combno;
	}
	public static void main(String args[]) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your full name:");
		String name=sc.nextLine();
		//sc.close();
		int unicode[]=new int[name.length()];
		for(int i=0;i<name.length();i++)
		{
			unicode[i]=name.charAt(i);
		}
		LabEx9 exe=new LabEx9();
		
		int pwd=exe.generatePassword(unicode,name.length());
		System.out.println(Integer.toOctalString(pwd));
		System.out.println(Integer.toHexString(pwd));
	}
}
