package com.handson.clsandmthds;

import java.util.ArrayList;

public class LabEx3
{
	   public static void main(String[] args) 
	   {
	      
		   ArrayList<Integer> arrlist = new ArrayList<Integer>(5);
		      arrlist.add(95);
		      arrlist.add(94);
		      arrlist.add(3);
		      arrlist.add(85);

		      System.out.println("Size of list: " + arrlist.size());
	      for (Integer number : arrlist) 
	      {
	         System.out.println("Number = " + number);
	      }  
	      arrlist.remove(2);
	      System.out.println("Now, Size of list: " + arrlist.size());
	      for (Integer number : arrlist) 
	      {
	         System.out.println("Number = " + number);
	      }
	   }
}
