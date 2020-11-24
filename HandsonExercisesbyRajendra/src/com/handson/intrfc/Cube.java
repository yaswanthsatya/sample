package com.handson.intrfc;

public class Cube extends Shape
{
	Cube(double length, double width, double heigth) 
	{
		super(length, width, heigth);
	}

	@Override
	void area()
	{
		this.area=(2*this.length*this.width)+(2*this.length*this.heigth)+(2*this.heigth*this.width);
	}

	@Override
	void volume() 
	{
		this.volume=this.length*this.width*this.heigth;
	}
}