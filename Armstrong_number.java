
public class Armstrong_number {

    public static void main(String[] args) {
    	int num = 8, originalNum, reminder, result = 0;
        originalNum = num;
        while (originalNum != 0)
        {
            reminder = originalNum % 10;
            result += Math.pow(reminder, 3);
            originalNum /= 10;
        }   
        if(result == num)
            System.out.println(num + " is an Armstrong number.");
        else
            System.out.println(num + " is not an Armstrong number.");
    }
}