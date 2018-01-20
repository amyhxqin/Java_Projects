import java.util.Scanner;

public class ReversingName {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.print("Type your name: ");
        String name = reader.nextLine();
        
        int i = name.length() - 1;
        String reverse = "";
        
        
        while(i >= 0){
            char character = name.charAt(i);
            i--;
            reverse = reverse + character;
        }
        
        System.out.print("In reverse order: " + reverse);
        
    }
}
