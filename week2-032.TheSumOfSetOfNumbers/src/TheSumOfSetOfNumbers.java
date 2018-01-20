
import java.util.Scanner;

public class TheSumOfSetOfNumbers {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int sum = 0;
        int number = 1;
        int limit;
        
        System.out.print("Until what? ");
        limit = Integer.parseInt(reader.nextLine());
        
        while(number<=limit){
            sum = sum + number;
            number++;
        }
        
        System.out.print("Sum is " + sum);

    }
}
