

import java.util.Scanner;

public class Count_Natural_no_range {
    
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Take number from user
        System.out.print("Enter any number : ");
        int num = scanner.nextInt();

        System.out.println("Natural numbers from 1 to " + num);

        int i = 1;

        while (i <= num) {

            System.out.print(i + " ");
            i++;
        }

    }

}