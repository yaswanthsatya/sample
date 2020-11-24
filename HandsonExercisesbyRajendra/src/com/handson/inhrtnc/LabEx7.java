package com.handson.inhrtnc;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class LabEx7 
{

	public static void main(String[] args) 
	{

		Worker1[] obj=new Worker1[5];
		obj[0]=new SalariedWorker1("c.m.punk",150);
		obj[1]=new SalariedWorker1("bigshow",250);
		obj[2]=new SalariedWorker1("roman",350);
		obj[3]=new DailyWorker1("mark",35000,3);
		obj[4]=new DailyWorker1("roman",450,4);


		for(int i=0;i<5;i++)
		{
			obj[i].pay();
		}

		Set<Worker1> Worker_set=new HashSet<Worker1>();

		Arrays.sort(obj);
		Worker_set.add(obj[0]);

		for(int i=0;i<5;i++)
		{
			int flag=0;
			for(Worker1 s:Worker_set)
			{
				if(s.name==obj[i].name)
				{
					flag=1;
				}
			}
			if(flag==0)
			{
				Worker_set.add(obj[i]);
			}
		}


		for(Worker1 s:Worker_set)
		{
			System.out.println(s);
		}
	}

}
