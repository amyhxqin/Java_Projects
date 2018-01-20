import java.util.Scanner;

public class GreaterNumber {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.print("Type the first number: ");
        double number1 = Double.parseDouble(reader.nextLine());
        
        System.out.print("Type the second number: ");
        double number2 = Double.parseDouble(reader.nextLine());
        
        if(number1 > number2){
        System.out.print("Greater number: " + number1);
        } else if(number1 < number2){
        System.out.print("Greater number: " + number2);
        }
        else {
        System.out.print("The numbers are equal!");
        }

    }
}
