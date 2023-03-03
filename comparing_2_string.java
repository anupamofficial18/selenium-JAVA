

public class comparing_2_string { 
	public static void main(String args[]) 
	{ 
		String string3 = new String("Anupam"); 
		String string4 = new String("Anupam"); 
		String string5 = new String("Ajay"); 


		// Comparing for String 3 = String 4 
		System.out.println("Comparing " + string3 + " and " + string4 
						+ " : " + string3.equals(string4)); 

		// Comparing for String 4 != String 5 
		System.out.println("Comparing " + string4 + " and " + string5 
						+ " : " + string4.equals(string5)); 

	} 
} 
