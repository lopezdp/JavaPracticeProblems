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
public class BankAccount 
{
    private final int accountNumber;
    private final double balance;
    
    public BankAccount(int accountNumber)
    {
        this.accountNumber = accountNumber;
        balance = 0;
    }
    
    public BankAccount(int accountNumber, double balance)
    {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
    
    public int getAccountNumber()
    {
        return accountNumber;
    }
    
    public static BankAccount deposit(BankAccount account, double amount)
    {
        return new BankAccount(account.accountNumber, (account.balance + amount));
    }
    
    public static BankAccount withdrawal(BankAccount account, double amount)
    {
        return new BankAccount(account.accountNumber, (account.balance - amount));
    }
    
    public double getBalance()
    {
        return balance;
    }
    
}
