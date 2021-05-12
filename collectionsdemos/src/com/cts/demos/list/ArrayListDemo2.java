package com.cts.demos.list;

import java.util.ArrayList;

public class ArrayListDemo2 {
	public static void main(String[] args) {
		ArrayList list=new ArrayList();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add("Ashok");
		list.add("Ram");
		for(Object obj : list)
		{
			Integer iObj=(Integer)obj;
			int i=iObj;
			System.out.println(i);
		}
	}
	
}
