package com.epam.Factory_Method_Pattern;

public class Rectangle implements Shape {
	int length=4,breadth=2,area;
	public void getArea()
	{
		area=length*breadth;
		System.out.println("Area of Rectangle : "+area);
	}

}
