package com.epam.Factory_Method_Pattern;

public class Triangle implements Shape {
	int base=2,height=5,area;
	public void getArea()
	{
		area=(base*height)/2;
		System.out.println("Area of triangle : "+area);
	}

}
