import java.util.Scanner;

public class LoopsEndingRemembering {
    public static void main(String[] args) {
        // program in this project exercises 36.1-36.5
        // actually this is just one program that is split in many parts
        
        Scanner reader = new Scanner(System.in);
        
        int sum = 0;
        int count = 0;
        double avg = 0;
        
        int countEven = 0;
        int countOdd = 0;
                
        System.out.println("Type numbers:");
        
        int number = Integer.parseInt(reader.nextLine());
        
        while(number != -1){
            sum = sum + number;
            count++;
            avg = 1.0 * sum/count;
            if(number%2 == 0){
                countEven++;
            } else if(number%2 != 0){
                countOdd++;
            }
            number = Integer.parseInt(reader.nextLine());
            
        }
        
        System.out.println("Thank you and see you later!");
        System.out.println("The sum is " + sum);
        System.out.println("How many numbers: " + count);
        System.out.println("Average: " + avg);
        System.out.println("Even numbers: " + countEven);
        System.out.println("Odd numbers: " + countOdd);

    }
}
