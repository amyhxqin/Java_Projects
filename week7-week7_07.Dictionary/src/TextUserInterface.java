
import java.util.Scanner;


public class TextUserInterface {
    private Dictionary dictionary;
    private Scanner reader;
    
    public TextUserInterface(Scanner reader, Dictionary dictionary){
        this.dictionary = dictionary;
        this.reader = reader;
    
    }
    
    public void start(){
        System.out.println("Statement:");
        System.out.println("  add - adds a word pair to the dictionary");
        System.out.println("  translate - asks a word and prints its translation");
        System.out.println("  quit - quit the text user interface");
        System.out.println("");
        
        String input = " ";
        
        while(true){
            System.out.print("Statement: ");
            input = reader.nextLine();
            
            if(input.equals("add")){
                System.out.print("In Finnish: ");
                String word = reader.nextLine();
                
                System.out.print("Translation: ");
                String translation = reader.nextLine();
                
                dictionary.add(word, translation);
                
            }
            else if (input.equals("translate")){
                System.out.print("Give a word: ");
                input = reader.nextLine();
                System.out.println("Translation: " + this.dictionary.translate(input));
            }
            else if (input.equals("quit")){
                break;
                
            }
            else{
                System.out.println("Unknown statement");
            }
            
            System.out.println("");
        }
        
        System.out.println("Cheers!");
    }
}
