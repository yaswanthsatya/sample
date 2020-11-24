package com.handson.clctns;

import java.util.*;

public class LabEx2 {

	public static void main(String[] args) 
	{
		Vector v1 = new Vector();
		Student st=new Student("yash",21);
		Teacher t=new Teacher("rajendra",45);
		Hod h=new Hod("sujatha",43,"cse");
	    v1.add(st);
		v1.add(t);
		v1.add(h);
		/*for (int i = 0; i < v1.size(); i++) 
	           System.out.println(v1.get(i) + " ");
		 */
		/*for(Object i : v1)
		{
			System.out.println(v1);
		}
		*/
		System.out.println(v1);

	}

}
