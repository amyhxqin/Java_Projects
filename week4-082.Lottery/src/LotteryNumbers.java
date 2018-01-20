import java.util.ArrayList;
import java.util.Random;

public class LotteryNumbers {
    private ArrayList<Integer> numbers;

    public LotteryNumbers() {
        // Draw numbers as LotteryNumbers is created
        this.drawNumbers();
    }

    public ArrayList<Integer> numbers() {
        return this.numbers;
    }

    public void drawNumbers() {
        // We'll format a list for the numbers
        this.numbers = new ArrayList<Integer>();
        // Write the number drawing here using the method containsNumber()
        Random randomizer = new Random();
        int i = 0;
        
        
        while(i < 7){
            int drawn = randomizer.nextInt(39)+1;
            if(!containsNumber(drawn)){
            this.numbers.add(drawn);
            i++;
            }
        }
        
        
    }

    public boolean containsNumber(int number) {
        // Test here if the number is already in the drawn numbers
        if(this.numbers.contains(number)){
            return true;
        }else{
            return false;
        }
        
    }
}
