
import java.util.Scanner;

public class Adder {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        // Implement your program here. Remember to ask the input from user
        System.out.print("Type a number: ");
        int firstInteger = Integer.parseInt(reader.nextLine());
        System.out.print("Type another number: ");
        int secondInteger = Integer.parseInt(reader.nextLine());
        
        int sum = firstInteger + secondInteger;
        System.out.print("Sum of the numbers: " + sum);
        
    }
}
