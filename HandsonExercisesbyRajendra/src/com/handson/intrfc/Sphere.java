package com.handson.intrfc;

public class Sphere extends Shape 
{

	double radius;

	Sphere(double length, double width, double heigth,double radius)
	{
		super(length, width, heigth);
		this.radius=radius;
		// TODO Auto-generated constructor stub
	}

	@Override
	void area()
	{
		// TODO Auto-generated method stub
		this.area=4*3.14*(this.radius*this.radius);
	}

	@Override
	void volume() 
	{
		// TODO Auto-generated method stub
		this.volume=4*3.14*(this.radius*this.radius*this.radius);
	}

}
