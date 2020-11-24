package com.handson.intrfc;

public abstract class Shape 
{
	double length;
	double width;
	double heigth;
	Shape(double length,double width,double heigth)
	{
		this.length=length;
		this.width=width;
		this.heigth=heigth;
	}
	double area;
	double volume;
	abstract void area();
	abstract void volume();
}
