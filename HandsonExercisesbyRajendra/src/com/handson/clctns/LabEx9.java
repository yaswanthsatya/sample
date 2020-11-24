package com.handson.clctns;

import java.util.*;

public class LabEx9 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		Map<String, String> map = new HashMap<>(); 

		map.put("good","moral skilled useful adequate"); 
		map.put("bad", "immoral harmful decayed"); 

		for (Map.Entry<String, String> e : map.entrySet())
		{
			if(e.getKey().equals(str))
				System.out.println(e.getValue()); 

		}
	}
}
