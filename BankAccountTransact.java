/**
 * David P. Lopez
 * COP2800 BankAccount
 * Programming Assignment
 */
package BankAccount;

/**
 * 305.467.5719
 * @author david.lopez016@mymdc.net
 */
public class BankAccountTransact {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        BankAccount dChecking = new BankAccount(1, 1000.00);
        System.out.println("D's Checking: " + dChecking.getBalance());
        
        System.out.println("Deposit $2000 to dChecking");        
        dChecking = BankAccount.deposit(dChecking, 2000.00);
        
        System.out.println("Withdrawal $700 from dChecking");        
        dChecking = BankAccount.withdrawal(dChecking, 700.00);
        
        System.out.println("Balance dChecking: " + dChecking.getBalance());
    }
}
