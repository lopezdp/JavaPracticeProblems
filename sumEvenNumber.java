/**
 * David P. Lopez
 * COP2800
 * Sum even numbers between 1 - 100
 */

/**
 * 305.467.5719
 * @author david.lopez016@mymdc.net
 */
public class SumEvenNumber {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int sum = 0;
        for(int x = 2; x <= 100; x = x+2)
        {
            sum += x;
        }
        
        System.out.println("The total sum is: " + sum);
    }
}
