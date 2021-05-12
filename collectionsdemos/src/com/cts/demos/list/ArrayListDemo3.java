package com.cts.demos.list;

import java.util.ArrayList;
// instanceof operator to check the type
// and typecast accordingly
public class ArrayListDemo3 {
	public static void main(String[] args) {
		ArrayList list=new ArrayList();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add("Ashok");
		list.add("Ram");
		for(Object obj : list)
		{                          
			if(obj instanceof Integer)
			{
			Integer iObj=(Integer)obj;
			int i=iObj;
			System.out.println(i);
			}
			else if(obj instanceof String)
			{
				String strObj=(String)obj;
				System.out.println(strObj);			}
			
			
		}
	}
	
}
