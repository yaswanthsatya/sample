package com.handson.intrfc;

import java.util.ArrayList;

public class Area 
{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Shape> list=new ArrayList<>();
		list.add(new Rectangle(2,4,0));
		list.add(new Cube(2,4,6));
		list.add(new Sphere(4,4,8,2));
		list.add(new Triangle(2,4,2));
		list.add(new Rectangle(2,4,0));
		list.forEach(i->{i.area();
					 i.volume();
					 System.out.println(i.getClass().getName()+" "+i.area+" "+i.volume);
					 });
	}

}
