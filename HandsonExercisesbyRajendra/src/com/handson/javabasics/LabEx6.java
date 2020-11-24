package com.handson.javabasics;

import java.util.Scanner;

public class LabEx6 
{
	public static void main(String[] args) 
	{
		// a............................................
		Scanner sc = new Scanner(System.in);
		System.out.println("please enter number:");
		int n = sc.nextInt();
		int sum = 0;
		int temp=n;    
		while(n>0)
		{    
			int r=n%10;  
			sum=(sum*10)+r;    
			n=n/10;    
		}    
		if(temp==sum)    
			System.out.println("palindrome number ");    
		else    
			System.out.println("not palindrome");    
		// b................................................
		int i;
		int m=0;
		int flag=0;      
		m=temp/2;      
		if(temp==0||temp==1){  
			System.out.println(temp+" is not prime number");      
		}else{  
			for(i=2;i<=m;i++)
			{      
				if(temp%i==0)
				{      
					System.out.println(temp+" is not prime number");      
					flag=1;      
					break;      
				}      
			}      
			if(flag==0)
				System.out.println(temp+"p");   
		} 
		
		sc.close();
	}

}
