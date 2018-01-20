public class PrintingLikeBoss {

    // copy or rewrite the method of Assignment 39.1 here
   public static void printStars(int amount) {
        // 39.1
        // you can print one star with the command
        // System.out.print("*");
        // call this command amount times    
        
        while(amount>0){
            System.out.print("*");
            amount--;
        }
        
        System.out.println("");
        
    }
   
    public static void printWhitespaces(int amount) {
        // 40.1
        while(amount>0){
            System.out.print(" ");
            amount--;
        }
    }

    public static void printTriangle(int size) {
        // 40.2
        int width = 1;
        
        while(width <= size){
            printWhitespaces(size-width);
            
            printStars(width);
            width++;
        }
    }

    public static void xmasTree(int height) {
        // 40.3
        int width = 0;
        
        while(width < height){
            printWhitespaces(height-width-1);
            
            printStars(1 + width*2);
            width++;
        }
        
        printWhitespaces(height-2);
        printStars(3);
        printWhitespaces(height-2);
        printStars(3);
        

    }

    public static void main(String[] args) {
        // Tests do not use main, you can write code here freely!

        printTriangle(5);
        System.out.println("---");
        xmasTree(4);

        
        System.out.println("---");
        xmasTree(10);

    }
}
