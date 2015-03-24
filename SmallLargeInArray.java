/**
 * David P. Lopez
 * COP2800 Chapter 7 Extra Credit
 * Programming Assignment
 */
package smallestInArrayAdd;
import java.util.Scanner;
/**
 * 305.467.5719
 * @author david.lopez016@mymdc.net
 */

public class SmallLargeInArray {

    
    public static void main(String[] args) 
    {
        final int LENGHT = 100;
        double[] values = new double[LENGHT];
        int currentSize = 0;
        
        //Read inputs
        
        System.out.println("Please enter values, Q to quit: ");
        Scanner in = new Scanner(System.in);
        
        while (in.hasNextDouble() && currentSize < values.length)
        {
            values[currentSize] = in.nextDouble();
            currentSize++;
        }
        
        //Find largest value
        
        double largest = values[0];
        
        for(int i = 1; i < currentSize; i++)
        {
            if(values[i]> largest)
            {
                largest = values[i];
            }
        }
        
        //Print all values, marking the largest
        
        for (int i = 0; i < currentSize; i++)
        {
            System.out.print(values[i]);
            
            if (values[i] == largest)
            {
                System.out.print(" <== largest values");
                }
            System.out.println();
        }
        
        // finding the Smallest
        double smallest = values[0];
        
        for(int i = 1; i < currentSize; i++)
        {
            if(values[i]< smallest)
            {
                smallest = values[i];
            }
        }
        
        //Print all values, marking the largest
        
        for (int i = 0; i < currentSize; i++)
        {
            System.out.print(values[i]);
            
            if (values[i]== smallest)
            {
                System.out.print(" <== Smallest values");
                }
            System.out.println();
        }
        
    }
    
}
