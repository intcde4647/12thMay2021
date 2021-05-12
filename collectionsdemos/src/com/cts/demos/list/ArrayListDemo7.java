package com.cts.demos.list;

import java.util.ArrayList;

public class ArrayListDemo7 {

	public static void main(String[] args) {
		
		ArrayList<String> list1=new ArrayList<>();
		
		list1.add("CTS");
		list1.add("XYZ");
		
		System.out.println("Before remove");
		System.out.println(list1);
		System.out.println("After remove");
		list1.remove("CTS");
		System.out.println(list1);
		
	}

}
