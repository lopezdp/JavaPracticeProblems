/**
 * David P. Lopez
 * COP2800 Chapter 7
 * Reversing Elements in an Array
 */
package reversed;
import java.util.Scanner;
import java.util.Arrays;

/**
 * 305.467.5719
 * @author david.lopez016@mymdc.net
 */
public class ReversingArrayElem {

    /**
     * @param arrayElement
     */
    
    public static int[] reverse(int[] arrayElement)
    {
        int[] reversedData = Arrays.copyOf(arrayElement, arrayElement.length);
        int j = 0;
        
        for(int i = arrayElement.length - 1; i >= 0; i--)
        {
            reversedData[j] = arrayElement[i];
            j++;
        }
        
        return reversedData;        
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner userInput = new Scanner(System.in);
        
        int arrLen;
        
        System.out.print("Enter the number of elements in the array: ");
        arrLen = userInput.nextInt();
        
        int[] arrElem = new int[arrLen];
        
        for(int i = 0; i < arrLen; i++)
        {
            System.out.println("Enter an integer into array element " + (i+1) + " : ");
            arrElem[i] = userInput.nextInt();
        }
        
        int[] revArr = reverse(arrElem);
        
        for(int i = 0; i < revArr.length; i++)
        {
            System.out.print(revArr[i] + " ");
        }
        
        System.out.println();
    }
}
