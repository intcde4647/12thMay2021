package com.cts.demos.set;

import java.util.HashSet;
import java.util.Iterator;

public class SetDemo1 {

	public static void main(String[] args) {

      HashSet<String> set=new HashSet<>();
      System.out.println(set.add("Ram"));
      System.out.println(set.add("Ravi"));
      System.out.println(set.add("Ram"));
      System.out.println(set.add("Zuben"));
      System.out.println(set);
      
      // as it is not ordered we dont have any get method
      // Object get(int pos)

      // Iterate either through for each or iterator
      
      for(String name : set)
      {
    	  System.out.println(name);
      }
      System.out.println("Through iterator");
	  Iterator<String> it=set.iterator();
	  while(it.hasNext())
	  {
		  String nm=it.next();
		  System.out.println(nm);
	  }
	
	}

}
