package com.handson.inhrtnc;

import java.util.Arrays;
import java.util.*;

public class Worker1  implements Comparable<Worker1>
{
	String name;
	int salary;
	Worker1(String name,int salary)
	{
		this.name=name;
		this.salary=salary;
	}
	public void pay() {}
	public int getWeeksSalary() 
		{return 1;}

	public int compareTo(Worker1 obj)
	{
		if(getWeeksSalary()>obj.getWeeksSalary())
		{
			return 1;
		}
		else
		{
			return -1;
		}
	}

}


class DailyWorker1 extends Worker1
{
	int weeksSalary;
	int noOfDays;
	DailyWorker1(String name,int salary,int noOfDays)
	{
		super(name,salary);
		this.noOfDays=noOfDays;
	}
	public void pay()
	{
		weeksSalary=noOfDays*salary;
	}

	public int getWeeksSalary()
	{
		return weeksSalary;
	}


	public String toString(){
		return "name :"+this.name+" salary :"+this.weeksSalary+" DailyWorker";
	}
}


class SalariedWorker1 extends Worker1
{
	int weeksSalary;
	SalariedWorker1(String name,int salary)
	{
		super(name,salary);
	}

	public void pay()
	{
		weeksSalary=salary*40;
	}

	public int getWeeksSalary()
	{
		return weeksSalary;
	}

	public String toString()
	{
		return "name :"+this.name+" salary :"+this.weeksSalary+" SalairedWorker";
	}
}


