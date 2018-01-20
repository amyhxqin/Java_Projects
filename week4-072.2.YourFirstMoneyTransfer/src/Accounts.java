
public class Accounts {

    public static void main(String[] args) {
        // Code in Account.Java should not be touched!
        // write your code here
        Account marksAccount = new Account("Matt's account", 1000.0);
        Account myAccount = new Account("My account", 0.0);
        
        marksAccount.withdrawal(100.0);
        myAccount.deposit(100.0);
        
        System.out.println("Mark's account: " + marksAccount);
        System.out.println("My account: " + myAccount);
    }

}
