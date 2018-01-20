
import java.util.Scanner;

public class Main {  

    public static void main(String[] args) {
    // implement your program here
    // do not put all to one method/class but rather design a proper structure to your program
        
    // Your program should use only one Scanner object, i.e., it is allowed to call 
    // new Scanner only once. If you need scanner in multiple places, you can pass it as parameter
    
    Scanner reader = new Scanner (System.in);
    Database birdwatchers = new Database ();
    
    
    String input = "";
    
    while(!input.equals("Quit")){
        System.out.print("? ");
        input = reader.nextLine();
        
        if(input.equals("Add")){
            String name = "";
            String latinName = "";
            
            System.out.print("Name: ");
            name = reader.nextLine();
            
            System.out.print("Latin Name: ");
            latinName = reader.nextLine();
            
            birdwatchers.add(new Bird(name, latinName));

        }
        
        if(input.equals("Observation")){
            System.out.print("What was observed:? ");
            input = reader.nextLine();
            
            birdwatchers.addObservation(input);
            }
        
        
        if(input.equals("Statistics")){
            birdwatchers.print();
        }
        
        if(input.equals("Show")){
            System.out.print("What? ");
            input = reader.nextLine();
            
            birdwatchers.show(input);
            
        }

    }
            
    }

}
