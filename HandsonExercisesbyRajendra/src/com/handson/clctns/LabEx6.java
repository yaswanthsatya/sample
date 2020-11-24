package com.handson.clctns;

import java.util.Arrays;

public class LabEx6 
{
	String name;
	int rank;
	LabEx6(String name,int rank)
	{
		this.name=name;
		this.rank=rank;
	}
	
	@Override
    public String toString()
	{ 
        return this.name+"  "+this.rank;
    } 
	
	public static void main(String[] args)
	{
		LabEx6[] src = new LabEx6[3];
		src[0]=new LabEx6("yash",96);
		src[1]=new LabEx6("randy",88);
		src[2]=new LabEx6("khali",79);
		
		 Arrays.sort(src, new Sortbyrank());
	        for (int i=0; i<3; i++) 
	            System.out.println(src[i]);
	}
}
