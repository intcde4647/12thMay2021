package com.cts.demos.list;

import java.util.ArrayList;

public class ArrayListDemo5 {
	public static void main(String[] args) {
		ArrayList<String> list1=new ArrayList<>();
		ArrayList<String> list2=new ArrayList<>();
		list1.add("CTS");
		list1.add("XYZ");
		// we need to copy from list1 to list2
		System.out.println("Before copying from list1 to list2");
		System.out.println(list1);
		System.out.println(list2);
		list2.addAll(list1);
		System.out.println("After copying from list1 to list2");
		System.out.println(list1);
		System.out.println(list2);
		
	}
}
