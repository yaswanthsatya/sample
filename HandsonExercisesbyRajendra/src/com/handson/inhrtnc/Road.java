package com.handson.inhrtnc;

public class Road 
{
	public static void main(String[] args) 
	{
		Truck t = new Truck();
		Bus  b = new Bus();
		Car c = new Car();
		
		
		System.out.println(c.colour);
		System.out.println(c.noOfWheels);
		System.out.println(c.model);
		
		//-----------------------------------
		
		System.out.println(b.colour);
		System.out.println(b.noOfWheels);
		System.out.println(b.model);
		//------------------------------------
		
		System.out.println(t.colour);
		System.out.println(t.noOfWheels);
		System.out.println(t.model);
		//-------------------------------------
		c.show();
		t.show();
		b.show();
		
	}
}
