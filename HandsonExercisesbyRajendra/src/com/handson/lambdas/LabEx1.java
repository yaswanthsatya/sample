package com.handson.lambdas;

import java.util.*;

public class LabEx1 
{
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		List<String> list = new ArrayList<>();
		
	    list.add("ambrose");
	    list.add("rollins");
	    list.add("rusev");
	    list.add("miz");
	    
	    list.sort((s1,s2)->s1.length()-s2.length());
	    System.out.println("Sort by length");
	    list.forEach(i->System.out.println(i));

	    System.out.println("Sort by length reverse");
	    list.sort((s1,s2)->s2.length()-s1.length());
	    list.forEach(i->System.out.println(i));
	    
	    System.out.println("Sort by First char");
	    list.sort((s1,s2)->s1.charAt(0)-s2.charAt(0));
	    list.forEach(i->System.out.println(i));
	    
	    System.out.println("Sort by 'E' char String first");
	    list.sort((s1,s2)->s2.indexOf("e")-s1.indexOf("e"));
	    list.forEach(i->System.out.println(i));
	    

	}
}
