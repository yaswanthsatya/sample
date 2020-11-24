package com.handson.clctns;

public class Hod 
{
	String name;
	int age;
	String dep;
	Hod(String name,int age,String dep)
	{
		this.name=name;
		this.age=age;
		this.dep=dep;
	}
	
	@Override
    public String toString() 
	{ 
        return this.name+"  "+this.age+" "+this.dep+"  Hod object";
    }
    
}
