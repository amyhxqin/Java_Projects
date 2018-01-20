import java.util.Scanner;

public class Palindromi {

    public static boolean palindrome(String text) {
        // write code here
        int i = 0;
        
        while(i < text.length()){
            if(text.charAt(i) == text.charAt(text.length() - 1 - i)){
                i++;
            }
            else{
                return false;
            }
        }
        return true;
        
    }

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.println("Type a text: ");
        String text = reader.nextLine();    
        if (palindrome(text)) {
            System.out.println("The text is a palindrome!");
        } else {
            System.out.println("The text is not a palindrome!");
        }
    }
}
