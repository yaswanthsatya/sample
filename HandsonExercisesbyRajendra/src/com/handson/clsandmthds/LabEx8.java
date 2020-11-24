package com.handson.clsandmthds;

import java.util.*;


public class LabEx8 
{
	public static void main(String[] args)
	{

		List<Student> l = new ArrayList<Student>();

		l.add(new Student(1,43,77,89));
		l.add(new Student(4,76,44,75));
		l.add(new Student(3,67,45,99));
		l.add(new Student(5,94,95,99));

		Collections.sort(l);
		for(Student s: l)
		{
			System.out.println(s.getreg());
		}

	}
}