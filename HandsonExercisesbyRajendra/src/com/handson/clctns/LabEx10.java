package com.handson.clctns;

import java.util.Scanner;
import java.util.TreeMap;

public class LabEx10 
{
	
	TreeMap<String,String> dir=new TreeMap<String, String>();
	
	void add(String key, String value) 
	{
		Scanner in=new Scanner(System.in);
		//TreeMap<String,String> dir=new TreeMap<String, String>();
		dir.put(key,value);
		
	}
	void delete(String key) 
	{
		String record=dir.get(key);
		dir.remove(key);
		System.out.println("Record deleted for: "+record);
		
	}
	
	void search(String key) 
	{
		System.out.println("record found : " +dir.get(key));
	}

	public static void main(String[] args) 
	{	
		LabEx10 t = new LabEx10();
		t.add("yash","999_999");
		t.add("punk", "888_888");
		t.add("mark", "777_777");
		t.search("yash");
		t.delete("mark");

	}
}
