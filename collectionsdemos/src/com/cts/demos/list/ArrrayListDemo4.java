package com.cts.demos.list;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrrayListDemo4 {

	public static void main(String[] args) {
		ArrayList<String> list=new ArrayList<>();
         list.add("Ravi");
         //list.add(1);
         list.add("Akash");
         for(String name : list)
         {
        	 System.out.println(name);
         }
         System.out.println("---------------------------");
         for(int i=0;i<list.size();i++)
         {
        	 System.out.println(list.get(i));
        	 
         }
	   System.out.println("--------------Through iterator-------------------");
	   Iterator<String> it=list.iterator();
	   while(it.hasNext())
	   {
		   String nm=it.next();
		   System.out.println(nm);
	   }
	   
	}

}
