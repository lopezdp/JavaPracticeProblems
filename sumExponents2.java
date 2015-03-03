/**
 * David P. Lopez
 * COP2800
 * Sum Powers of 2
 */
package powersof2;
/**
 * 305.467.5719
 * @author david.lopez016@mymdc.net
 */
public class SumExponents2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int sum = 0;
        for (int x = 0; x <= 20; x++)
        {
            System.out.println("2 to the " + x + " equals: " + Math.pow(2.0,x));
        }
