
public class Smileys {

    public static void main(String[] args) {
        // Test your method at least with the following
        printWithSmileys("Method");
        printWithSmileys("Beerbottle");
        printWithSmileys("Interface");
    }
    
    private static void printWithSmileys(String characterString){
        printFullLine(characterString);
        printSide(characterString);
        printFullLine(characterString);

                
    }
    
    private static void printFullLine (String characterString){
        int length = characterString.length();
        
        if(length % 2 == 1){
            for (int i = 0; i < (length + 1)/2 + 3; i++) {
                System.out.print(":)");
            }
            
            System.out.println("");
        }
        
        else{
            for (int i = 0; i < length/2 + 3; i++) {
                System.out.print(":)");
            }
            
            System.out.println("");
            
        }
    }
    
    private static void printSide (String characterString) {
        int length = characterString.length();
        
         if(length % 2 == 1){
             System.out.print(":) ");
             System.out.print(characterString + " ");
             System.out.println(" :)");
             
         }
         
         else{
             System.out.print(":) ");
             System.out.print(characterString);
             System.out.println(" :)");
         }
    }

}
