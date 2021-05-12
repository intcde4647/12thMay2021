package com.cts.demos.list;

import java.util.ArrayList;

public class ArrayListDemo1 {
// This is an example without using Generics
	public static void main(String[] args) {
		ArrayList list=new ArrayList();
		list.add(1);
		list.add(2);
		list.add(3);
        list.add(4);  // primitive int 4 is converted into Integer and Integer further getting
        // into Object
        // int---->Integer------->Object
	   System.out.println(list);
	   for(Object object : list)
	   {
		   Integer iobj=(Integer)object;
		   int i=iobj;
		   System.out.println(i);
	   }
	   System.out.println("----------------------");
	   Object obj1=list.get(2);   // Object get(int pos) It will return the object in that position
	   Integer iobj2=(Integer)obj1;
	   int j=iobj2;
	   System.out.println(j);
	
    System.out.println("-----------------------------------");
	for(int i=0;i<list.size();i++)
	{
		  Object obj3=list.get(i);
		  Integer iobj3=(Integer)obj3;
		  int k=iobj3;
		  System.out.println(k);
	}
	}
}
