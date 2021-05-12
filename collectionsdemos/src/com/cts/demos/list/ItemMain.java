package com.cts.demos.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class ItemMain {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		ArrayList<Item> itemList=new ArrayList<>();
		int choice=0;
		while(true)
		{
          System.out.println("1) ADD ITEM");
          System.out.println("2) DISPLAY ITEMS");
          System.out.println("3) REMOVE ITEMS");
          System.out.println("4) EXIT");
          System.out.println("Enter your choice");
          choice=scanner.nextInt();
          switch(choice)
          {
          case 1 : Item item=new Item();
                   System.out.println("Enter the item id");
                   item.setId(scanner.nextInt());
                   System.out.println("Enter the description");
                   item.setDesc(scanner.next());
                   System.out.println("Enter the price");
                   item.setPrice(scanner.nextFloat());
                   itemList.add(item);
                   break;
          case 2 : System.out.println("The items are");
                   for(Item it : itemList)
                   {
                	   System.out.format("%5d%20s%5.2f\n",it.getId(),it.getDesc(),it.getPrice());
                   }
                   break;
          case 3 : System.out.println("Enter the item id to delete");
                   int id=scanner.nextInt();
                   Iterator<Item> it=itemList.iterator();
                   while(it.hasNext())
                   {
                	   Item search=it.next();
                       if(search.getId()==id)
                       {
                    	   it.remove();
                    	   break;
                       }
                   }
                   break;
          case 4 : System.exit(0);         
          }   // end of switch case
		}   // end of while loop
		
		
	} // end of main

} // end of class
