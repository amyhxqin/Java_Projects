import java.util.Scanner;

public class FirstCharacters {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.print("Type your name: ");
        String name = reader.nextLine();
        
        if(name.length() >= 3){
            char firstChar = first(name);
            char secondChar = second(name);
            char thirdChar = third(name);
            
            System.out.println("1. character: " + firstChar);
            System.out.println("2. character: " + secondChar);
            System.out.println("3. character: " + thirdChar);
        
        }
    }
    
    public static char first(String text){
        return text.charAt(0);
    }
    
    public static char second(String text){
        return text.charAt(1);
    }
    
    public static char third(String text){
        return text.charAt(2);
    
    }
}
