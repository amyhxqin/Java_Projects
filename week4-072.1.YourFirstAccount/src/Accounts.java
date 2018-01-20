
import java.util.Scanner;

public class Accounts {

    public static void main(String[] args) {
        // Code in Account.Java should not be touched!
        // write your code here
        Scanner reader = new Scanner(System.in);
        
        Account bartosAccount = new Account("Barto's account",100.0);
        
        //double deposit = Double.parseDouble(reader.nextLine());
        bartosAccount.deposit(20.0);
        
        System.out.println("Final state");
        System.out.println(bartosAccount);

    }

}
