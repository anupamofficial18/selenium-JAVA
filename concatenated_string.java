

public class concatenated_string {

public static void main(String[] args)
    {
        String str1 = "Testing String:1 and ";
        String str2 = "String:2";
        
System.out.println();
System.out.println("String 1: " + str1);
System.out.println("String 2: " + str2); 


        // Concatenate the two strings together.
        String str3 = str1.concat(str2);

        // Display the new String.
System.out.println("The concatenated string: " + str3);
System.out.println();
    }
}
