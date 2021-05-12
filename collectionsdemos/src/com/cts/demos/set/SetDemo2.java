package com.cts.demos.set;

import java.util.Iterator;
import java.util.TreeSet;

// In TreeSet it will be in sorted order
public class SetDemo2 {

	public static void main(String[] args) {

      TreeSet<String> set=new TreeSet<>();
      System.out.println(set.add("Ram"));
      System.out.println(set.add("Ravi"));
      System.out.println(set.add("Ram"));
      System.out.println(set.add("Zuben"));
      System.out.println(set.add("Ajay"));
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
