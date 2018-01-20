
import java.util.Scanner;

public class BiggerNumber {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        // Implement your program here. Remember to ask the input from user
        System.out.print("Type a number: ");
        int firstInt = Integer.parseInt(reader.nextLine());
        
        System.out.print("Type another number: ");
        int secondInt = Integer.parseInt(reader.nextLine());
        
        int biggerInt;
        
        if (firstInt > secondInt) {
            biggerInt = firstInt;
        }
        
        else {
            biggerInt = secondInt;
        }
        
        System.out.print("The bigger number of the two numbers given was: " + biggerInt);
    }
}
