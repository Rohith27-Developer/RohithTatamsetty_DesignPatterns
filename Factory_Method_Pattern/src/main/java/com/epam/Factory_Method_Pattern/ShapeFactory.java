package com.epam.Factory_Method_Pattern;
public class ShapeFactory {
	public Shape getShape(String shapeType){
		if(shapeType == null){
			return null;
		}		
		if(shapeType.equalsIgnoreCase("Circle")){
			return new Circle();

		} else if(shapeType.equalsIgnoreCase("Rectangle")){
			return new Rectangle();

		} else if(shapeType.equalsIgnoreCase("Triangle")){
			return new Triangle();
		}
		return null;
	}
}
