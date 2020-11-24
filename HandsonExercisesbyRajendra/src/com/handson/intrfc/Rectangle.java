package com.handson.intrfc;

public class Rectangle extends Shape 
{
	Rectangle(double length, double width,double heigth)
	{
		super(length, width, heigth);
		
	}

	@Override
	void area()
	{
		this.area=this.length*this.width;
	}

	@Override
	void volume() 
	{
		this.volume=-1;	
	}

}
