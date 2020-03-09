package com.epam.Singleton_Pattern;
public class Singleton {
	public static void main(String[] args) {
		//Shape s=new Shape(); 
		Shape s = Shape.getInstance();
		s.getShape();
	}

}
