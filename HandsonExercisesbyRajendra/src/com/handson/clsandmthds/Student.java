package com.handson.clsandmthds;

import java.util.*;

public class Student implements Comparable<Student> 
{
	  int reg, ma, sc, en;
		
		Student(int reg, int ma, int sc, int en)
		{
			
			this.reg=reg;
			this.en=en;
			this.ma=ma;
			this.sc=sc;
		}
		public int getreg() 
		{
			return reg;
		}
		
		@Override
		public int compareTo(Student o) 
		{
			// TODO Auto-generated method stub
			//return 0; {
				return this.reg - o.getreg();
        }
}
