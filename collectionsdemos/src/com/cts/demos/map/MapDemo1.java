package com.cts.demos.map;

import java.util.HashMap;
import java.util.Set;

public class MapDemo1 {

	public static void main(String[] args) {
		HashMap<Integer,String> nameDetails=new HashMap<>();
        nameDetails.put(1,"Rohit");
        nameDetails.put(2, "Suresh");
        nameDetails.put(3, "John");
           
        Set<Integer> keys=nameDetails.keySet();
        System.out.println(keys);
        String nm=nameDetails.get(2);
        System.out.println(nm);
        for(int key : keys)
        {
        	System.out.println(key+"\t"+nameDetails.get(key));
        }
	}

}
