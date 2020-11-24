package com.handson.clctns;

import java.util.*;

public class LabEx8 
{
	public static void main(String[] args) 
    { 
		Scanner sc=new Scanner(System.in);
        Set<Integer> hs = new HashSet<Integer>(); 
        
        for(int i=0;i<10;i++)
        {
        	hs.add(sc.nextInt());
        }
        
        List<Integer> list = new ArrayList<Integer>(hs);
        
        Collections.sort(list); 
        
       System.out.println(list);
   
    } 
}
