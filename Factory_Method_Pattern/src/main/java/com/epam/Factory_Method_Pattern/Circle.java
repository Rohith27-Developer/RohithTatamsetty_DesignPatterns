package com.epam.Factory_Method_Pattern;

public class Circle implements Shape{
	double radius=4,area;
	public void getArea()
	{
		area=3.14*radius*radius;
		System.out.println("Area of Circle : "+area);
	}
}
