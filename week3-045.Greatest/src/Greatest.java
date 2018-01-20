
public class Greatest {

    public static int greatest(int number1, int number2, int number3) {
        return greater(greater(number1, number2), number3);
    }
    
    public static int greater(int number1, int number2){
        if(number1==number2){
            return number1;
        }
        else if(number1>number2){
            return number1;
           
        }
        else{
            return number2;
        }
    }

    public static void main(String[] args) {
        int result = greatest(2, 7, 3);
        System.out.println("Greatest: " + result);
    }
}