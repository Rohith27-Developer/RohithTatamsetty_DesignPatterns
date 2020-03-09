package com.epam.Iterator_Pattern;
public class Iterator_Pattern {
	public static void main(String[] args) {
		Initialize_Iterator initialize_Iterator=new Initialize_Iterator();
		for(Iterator_Interface iter=initialize_Iterator.getIterator();iter.hasNext();){
			String name = (String)iter.next();
			System.out.println(name);
		} 
	}
}
