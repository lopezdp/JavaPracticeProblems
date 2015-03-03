/**
 * David P. Lopez
 * COP2800
 * Sum Odd numbers a & b as inputs
 */
package inputSumOdds;
import java.util.Scanner;

/**
 * 305.467.5719
 * @author david.lopez016@mymdc.net
 */
public class SumOfOddNumbers {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner(System.in);
        
        System.out.println("Enter variable a: ");
        int a;
        a = in.nextInt();
        
        System.out.println("Enter variable b: ");
        int b;
        b = in.nextInt();
        
        int sum = 0;
        
        for (int x = a; x <= b; x++)
        {
            if(x%2 == 1)
            {
                sum += x;
            }
        }
        
        System.out.println("The sum is " + sum + ".");
    }
}
