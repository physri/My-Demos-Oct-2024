package Samples;// Java code to illustrate containsAll() method

import java.util.ArrayList;
import java.util.List;

public class ListIntegerDemo {
	public static void main(String args[]) 
	{ 
		// Creating an empty list 
		List<Integer> list = new ArrayList<>();

		// Use add() method to add elements 
		// into the List 
		list.add(4);
		list.add(25);
		list.add(125);
		list.add(75);
		list.add(17);

		// Displaying the List 
		System.out.println("List: " + list); 

		// Creating another empty List 
		List<Integer> listTemp = new ArrayList<>();

		listTemp.add(25);
		listTemp.add(4);
		listTemp.add(75);

		System.out.println("Are all the contents equal? "
						+ list.containsAll(listTemp)); 
	} 
} 
