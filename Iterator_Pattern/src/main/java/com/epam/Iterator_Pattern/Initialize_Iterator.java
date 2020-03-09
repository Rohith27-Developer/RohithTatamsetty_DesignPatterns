package com.epam.Iterator_Pattern;
public class Initialize_Iterator implements Initialize_Interface {
	public Iterator_Interface getIterator() {
		return new Iterator_Methods();
	}
}
