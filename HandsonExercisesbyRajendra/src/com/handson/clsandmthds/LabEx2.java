package com.handson.clsandmthds;

import java.util.*;

public class LabEx2 
{
	// Pushing element on the top of the stack
	static void stack_push(Stack<Integer> stack)
	{
	System.out.println("Enter the number of elemts :");
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int m[]=new int[n];
	for(int i = 0; i < n; i++)
	{
	m[i]=sc.nextInt();
	stack.push(m[i]);
	System.out.println(stack);
	}
	}

	// Popping element from the top of the stack
	static void stack_pop(Stack<Integer> stack)
	{
	System.out.println("Enter the number of elemts to pop:");
	Scanner sc=new Scanner(System.in);
	int k=sc.nextInt();
	System.out.println("Pop Operation:");

	for(int i = 0; i <k; i++)
	{
	Integer y = (Integer) stack.pop();
	System.out.println(y);
	}
	}
	public static void main (String[] args)
	{
	Stack<Integer> stack = new Stack<Integer>();
	stack_push(stack);
	stack_pop(stack);
	System.out.println("the elements remaining are:"+stack);
	}
}
