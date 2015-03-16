/**
 * David P. Lopez
 * COP2800
 * Chapter 6 String Manipulator
 */
package stringManipulator;
import java.util.Scanner;

/**
 * 305.467.5719
 * @author david.lopez016@mymdc.net
 */
public class StrManPro 
{
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner userInput;
        userInput = new Scanner(System.in);
       
        System.out.println("Please enter your words");
        String str = userInput.nextLine();
        
        for(int i = 0; i < str.length(); i++)
        {
            char ch = str.charAt(i);
            System.out.println(ch);            
        }        
    }
}
