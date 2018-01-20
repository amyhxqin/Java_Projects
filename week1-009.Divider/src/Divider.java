
import java.util.Scanner;

public class Divider {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        // Implement your program here. Remember to ask the input from user.
        System.out.print("Type a number: ");
        int firstInteger = Integer.parseInt(reader.nextLine());
        System.out.print("Type another number: ");
        int secondInteger = Integer.parseInt(reader.nextLine());
        
        double quotient = 1.0 * firstInteger / secondInteger;
        System.out.print("Division: " + firstInteger + " / " + secondInteger + " = " + quotient);
    }
}
