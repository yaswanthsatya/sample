package com.handson.inhrtnc;

import java.util.*;

public class CollectionBox 
{
	static Scanner sc=new Scanner(System.in);
	public static void enteringValues(Map<Integer, Integer> note, Map<Integer, Integer> coin)
	{
		System.out.println("Enter the value of the note and number of notes");
		char ch='Y';
		while(ch=='Y'||ch=='y')
		{
			note.put(sc.nextInt(), sc.nextInt());
			System.out.println("Do you want to Continue?:Y or N");
			ch=sc.next().charAt(0);
		}
		System.out.println("Enter the value of the coin and number of coins");
		ch='Y';
		while(ch=='Y'|| ch=='y')
		{
			coin.put(sc.nextInt(), sc.nextInt());
			System.out.println("Do you want to Continue?:Y or N");
			ch=sc.next().charAt(0);
		}
	}
	private static void display(double finalAmount)
	{
		System.out.printf("The Total amount Donated is %.2f\n",finalAmount);
	}
	public static void main(String args[])
	{
		Map<Integer,Integer>note =new HashMap<>();
		Map<Integer,Integer>coin=new HashMap<>();
		char ch='Y';
		double finalAmount=0.0;
		while(ch=='Y'||ch=='y')
		{
			System.out.println("Enter the type of Currency:");
			System.out.println("1.Dollar");
			System.out.println("2.Pound");
			System.out.println("3.Rupees");
			int choice=sc.nextInt();
			switch (choice)
			{
			case 1:
			{
				enteringValues(note,coin);
				Dollar dol=new Dollar(note,coin);
				finalAmount+=dol.compute(dol.totalCoin(note),dol.totalNote(coin));
				dol.print();
			}
			break;
			case 2:
			{
				enteringValues(note,coin);
				Pound pou=new Pound(note,coin);
				finalAmount+=pou.compute(pou.totalCoin(note),pou.totalNote(coin));
				pou.print();
			}
			break;
			case 3:
			{
				enteringValues(note,coin);
				Rupee rup=new Rupee(note,coin);
				finalAmount+=rup.compute(rup.totalCoin(note),rup.totalNote(coin));
				rup.print();
			}
			break;
			default:
				System.out.println("Unexpected value: " + choice);
			}
			System.out.println("Do you want to Continue?:Y or N");
			ch=sc.next().charAt(0);
			note.clear();
			coin.clear();
		}
		display(finalAmount);
		sc.close();
	}
}
