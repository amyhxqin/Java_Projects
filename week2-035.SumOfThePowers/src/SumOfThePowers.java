
import java.util.Scanner;

public class SumOfThePowers {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        int limit;
        int power = 0;
        int sum = 0;
        
        System.out.print("Type a number: ");
        limit = Integer.parseInt(reader.nextLine());
        
        while(power<=limit){
            sum = sum + (int)Math.pow(2,power);
            power++;
        
        }
        
        System.out.print("The result is " + sum);

    }
}
