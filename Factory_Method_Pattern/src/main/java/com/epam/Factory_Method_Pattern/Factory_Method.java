package com.epam.Factory_Method_Pattern;
public class Factory_Method {
	public static void main(String[] args) {
		ShapeFactory shapeFactory = new ShapeFactory();
	      Shape shape1 = shapeFactory.getShape("CIRCLE");
	      shape1.getArea();;
	      Shape shape2 = shapeFactory.getShape("RECTANGLE");
	      shape2.getArea();;
	      Shape shape3 = shapeFactory.getShape("Triangle");
	      shape3.getArea();;
	}
}
