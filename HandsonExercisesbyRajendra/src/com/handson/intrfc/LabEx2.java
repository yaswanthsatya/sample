package com.handson.intrfc;

import java.util.*;
import java.util.Collections;
import java.util.List;

class Athlets implements Comparable<Athlets> 
{
	String name;
	char grade;
	Athlets(String name)
	{
		this.name=name;
	}
	@Override
	public int compareTo(Athlets athlet) 
	{
		return this.name.compareTo(athlet.name);
	}
	
}
public class LabEx2 
{

	public static void main(String[] args) 
	{
		ArrayList<Athlets> arraylist = new ArrayList<Athlets>();
		   arraylist.add(new Athlets("chaitu"));
		   arraylist.add(new Athlets("ganesh"));
		   arraylist.add(new Athlets("akhil"));
		   arraylist.add(new Athlets("tharun"));
		   arraylist.add(new Athlets("sam"));
		   arraylist.add(new Athlets("anudeep"));
		   arraylist.add(new Athlets("iam"));
		   arraylist.add(new Athlets("china"));
		   arraylist.add(new Athlets("usa"));
		   arraylist.add(new Athlets("basa"));
		   arraylist.forEach((i)->{if(i.name=="iam") {i.grade='A';}else i.grade='B';});
		   Collections.sort(arraylist);
		   arraylist.forEach(i->System.out.println(i.name+" "+i.grade));   

	}
	
}
