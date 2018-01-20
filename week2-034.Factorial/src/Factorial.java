import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        int number = 1;
        int product = 1;
        
        System.out.print("Type a number: ");
        int limit = Integer.parseInt(reader.nextLine());
        
        while(number<=limit){
            product = product*number;
            number++;
        }
        
        System.out.print("Factorial is " + product);
        

    }
}
