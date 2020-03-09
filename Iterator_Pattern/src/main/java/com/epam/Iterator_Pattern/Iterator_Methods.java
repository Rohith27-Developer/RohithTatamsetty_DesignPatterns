package com.epam.Iterator_Pattern;
public class Iterator_Methods implements Iterator_Interface {
	int index = 0;
	public static String details[] = {"Name : Rohith","Age : 20" ,"Gender : Male"};
	public boolean hasNext() {		
        if(index < details.length){
           return true;
        }
        return false;
     }
     public Object next() {
        if(this.hasNext()){
           return details[index++];
        }
        return null;
     }
}
