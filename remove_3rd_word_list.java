

import java.awt.List;
import java.util.ArrayList;

public class remove_3rd_word_list {
  public static void main(String[ ] args) {
	  
    // Creating list and add some colors to the list
	  ArrayList<String> list_Strings = new ArrayList<String>();
	  list_Strings.add("Red");
	  list_Strings.add("Green");
	  list_Strings.add("Orange");
	  list_Strings.add("White");
	  list_Strings.add("Black");
	  
	  // Print the list
	  System.out.println(list_Strings);
	  
	  // Remove the third element from the list.
	  list_Strings.remove(2);
	  
	  // Print the list again
	  System.out.println("After removing third element from the list:\n"+list_Strings);
	 }
	}