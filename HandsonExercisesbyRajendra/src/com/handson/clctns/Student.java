package com.handson.clctns;

public class Student 
{
	String name;
	int age;
	Student(String name,int age)
	{
		this.name=name;
		this.age=age;
	}
	
	@Override
    public String toString() 
	{ 
        return this.name+"  "+this.age+"  Student object";
    }
}
