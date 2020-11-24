package com.handson.clctns;

public class Teacher 
{
	String name;
	int age;
	Teacher(String name,int age)
	{
		this.name=name;
		this.age=age;
	}
	@Override
    public String toString()
	{ 
        return this.name+"  "+this.age+"  Teachers object";
    } 
}
