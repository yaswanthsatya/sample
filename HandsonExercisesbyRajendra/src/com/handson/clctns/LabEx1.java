package com.handson.clctns;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class LabEx1 
{
	public static void main(String args[])
	{
		ArrayList<String> ar=new ArrayList<String>();
		ar.add("krishna");
		ar.add("ramya");
		ar.add("mahesh");
		ar.add("yash");
		ar.add("devi");
		ar.add("satya");
		ar.add("venky");
		ar.add("cat");
		ar.add("dog");
		ar.add("lot");
		Collections.sort(ar);
		HashMap<ArrayList<String>,ArrayList<String>> map=new HashMap<ArrayList<String>,ArrayList<String>>();
		int j=0;
		int n=5;
		for(int i=1;i<=2;i++)
		{
			ArrayList<String> names=new ArrayList<String>();
			while(j!=n)
			{
				names.add(ar.get(j));
				j++;
			}
			ArrayList<String> allotment=new ArrayList<String>();
			String g="group"+i;
			allotment.add(g);
			String s="Seminar"+i;
			allotment.add(s);
			map.put(allotment,names);
			n=n+5;
		}
		System.out.println(map);
	}
}
