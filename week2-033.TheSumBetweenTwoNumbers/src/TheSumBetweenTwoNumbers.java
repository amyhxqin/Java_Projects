
import java.util.Scanner;


public class TheSumBetweenTwoNumbers {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int sum = 0;
        int number;
        int limit;
        
        System.out.print("First: ");
        number = Integer.parseInt(reader.nextLine());
        
        System.out.print("Last: ");
        limit = Integer.parseInt(reader.nextLine());
        
        while(number<=limit){
            sum = sum + number;
            number++;
        }
        
        System.out.print("Sum is " + sum);
    }
}
