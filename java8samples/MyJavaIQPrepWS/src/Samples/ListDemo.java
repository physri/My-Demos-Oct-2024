package Samples;// Java code to illustrate containsAll() method
import java.util.*; 

public class ListDemo { 
	public static void main(String args[]) 
	{ 
		// Creating an empty list 
		List<String> list = new ArrayList<String>(); 

		// Use add() method to add elements 
		// into the List 
		list.add("4");
		list.add("To");
		list.add("Geeks");
		list.add("Welcome");
		list.add("Geeks");

		// Displaying the List 
		System.out.println("List: " + list); 

		// Creating another empty List 
		List<String> listTemp = new ArrayList<String>(); 

		listTemp.add("Geeks"); 
		listTemp.add("4"); 
		listTemp.add("Geeks"); 

		System.out.println("Are all the contents equal? "
						+ list.containsAll(listTemp)); 
	} 
} 
