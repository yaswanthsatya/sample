package com.handson.inhrtnc;
public class Worker 
{
	String name;
	public int salary;
	String tow;
	public Worker(String name, int salary, String tow) 
	{
		super();
		this.name = name;
		this.salary = salary;
		this.tow = tow;
	}
	public void pay() 
	{
		// TODO Auto-generated method stub
		System.out.println(name+" "  +salary +" "+ tow);

	}
}
class DailyWorker extends Worker
{
	int noOfDays;
	int weekpay;
	public DailyWorker(String name, int salary, String tow)
	{
		super(name, salary, tow);
		// TODO Auto-generated constructor stub
	}
	public void pay(int noOfDays) 
	{
		super.pay();
		int weekpay=noOfDays*salary;
		System.out.println(weekpay);
	}
}
class SalariedWorker extends Worker
{
	//String name;
	//int salary;
	//String tow;
	public SalariedWorker(String name, int salary, String tow) 
	{
		super(name, salary, tow);
		// TODO Auto-generated constructor stub
	}
	public void pay() 
	{
		super.pay();
		int weekpay=7*salary;
		System.out.println(weekpay);
	}
}
class output
{

	public static void main(String[] args) 
	{
		//Worker w=new Worker();
		DailyWorker dw=new DailyWorker("min",3000,"dw");
		SalariedWorker sw=new SalariedWorker("dev",2000,"se");
		dw.pay(5);
		sw.pay();

	}

}
