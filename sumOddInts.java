/**
 * David P. Lopez
 * COP2800
 * Sum Odd numbers inside of input
 */
package inputOddsAndSum;
import java.util.Scanner;

/**
 * 305.467.5719
 * @author david.lopez016@mymdc.net
 */
public class SumOddInts {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
        int num;
        System.out.println("Enter an integer: ");
        num = input.nextInt();
        
        int sum = 0;
        int digit;
        
        while(num > 0)
        {
            digit = num % 10;
            
            if (digit % 2 == 1)
            {
                sum += digit;
            }
            
            num = num / 10;
            
        }
        
        System.out.print("The sum is " + sum + ".");
        
    }
    
}
