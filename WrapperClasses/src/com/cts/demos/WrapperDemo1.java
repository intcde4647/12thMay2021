package com.cts.demos;

public class WrapperDemo1 {

	public static void main(String[] args) {
		int i=10;
		// We need to convert it into object 
		// representation from primitive type
		Integer iObj=new Integer(i);
		// The primitive i got converted into Integer object.
		// from object back to primitive type
		int j=iObj.intValue(); // intValue is helping to convert back to primitive type.
		
	}

}
