package com.handson.inhrtnc;

public class Truck extends Vehicle
{
	Truck()
	{
		super();
	}
	int noOfWheels = 6;
	String colour = "green";
	double model = 3.0;
	void show()
	{
		super.show();
		System.out.println("this is truck");
	}

}
