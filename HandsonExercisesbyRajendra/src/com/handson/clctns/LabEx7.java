package com.handson.clctns;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class LabEx7 
{
	public static void main(String args[])
	{
		ArrayList<Integer> ar=new ArrayList<Integer>();
		ar.add(1);
		ar.add(2);
		ar.add(6);
		ar.add(3);
		ar.add(4);
		ar.add(5);
		ar.add(6);
		ar.add(7);
		ar.add(9);
		ar.add(4);
		Set<Integer> st=new HashSet<Integer>(ar);
		for(Integer s: st)
		{
			if(Collections.frequency(ar,s)>1)
				System.out.print(s+" ");
			
		}
	}
}
