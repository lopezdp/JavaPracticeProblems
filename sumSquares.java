/**
 * David P. Lopez
 * COP2800
 * Bank Account Application
 */
package sumSquares;
/**
 * 305.467.5719
 * @author david.lopez016@mymdc.net
 */
public class SumSquares {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int sum = 0;
        for (int x = 1; x <= 100; x++)
        {
            sum += x * x;
        }
        
        System.out.println("The sum squares between 1 - 100 is: " + sum);
    }
}
