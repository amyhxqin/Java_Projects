import java.util.Random;

public class PasswordRandomizer {
    // Define the variables
    private int length;
    private String password;
    private Random randomizer;

    public PasswordRandomizer(int length) {
        // Initialize the variable
        this.length = length;
        this.randomizer = new Random();
        
    }

    public String createPassword() {
        // write code that returns a randomized password
        int i = 0;
        this.password = "";
        
        while(i < this.length){
            int number = randomizer.nextInt(26);
            char symbol = "abcdefghijklmnopqrstuvwxyz".charAt(number);
            this.password += symbol;
            i++;
        }
        return this.password;
    }
}
