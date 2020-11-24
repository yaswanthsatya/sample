package com.handson.intrfc;

public class Triangle extends Shape
{

	Triangle(double length, double width, double heigth) 
	{
		super(length, width, heigth);
	}

	@Override
	void area() 
	{
		this.area=(this.width/2)*this.heigth;
	}

	@Override
	void volume() 
	{
		this.volume=-1;
	}

}
