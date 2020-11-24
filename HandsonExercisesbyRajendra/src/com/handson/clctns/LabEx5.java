package com.handson.clctns;

import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

public class LabEx5
{

	public static void main(String args[])
	{
		int[] arr=new int[6];
		int temp=1;
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<6;i++)
			arr[i]=sc.nextInt();
		Queue<Integer> q1=new PriorityQueue<>();
		Queue<Integer> q2=new PriorityQueue<>();
		for(int i=0;i<6;i++)
		{
			if((i+1)==temp)
			{
				temp+=3;
				q1.add(arr[i]);
			}
			else
				q2.add(arr[i]);
		}
		System.out.println("senior citizens queue"+q1);
		System.out.println("General queue"+q2);
	}

}
