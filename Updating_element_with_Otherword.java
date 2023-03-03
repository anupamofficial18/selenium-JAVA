

import java.util.ArrayList;

public class Updating_element_with_Otherword {
  public static void main(String[ ] args) {
	  
	// Create a list and add some colors to the list
	  ArrayList<String> list_Strings = new ArrayList<String>();
	  list_Strings.add("Red");
	  list_Strings.add("Green");
	  list_Strings.add("Orange");
	  list_Strings.add("White");
	  list_Strings.add("Black");
	  
	  // Print the list
	  System.out.println(list_Strings);
	 
	  // Updating the element with "Orange"
	  list_Strings.set(4, "Orange");
	  
	   // Printing the updated list again
	  System.out.println(list_Strings);
	 }
	}