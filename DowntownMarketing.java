/**
 * David P. Lopez
 * COP2800 Final Exam Extra Credit
 * Programming Assignment
 */
package discount;
import java.util.*;
/**
 * 305.467.5719
 * @author david.lopez016@mymdc.net
 */

   
public class DowntownMarketing 
{
    public static void main(String[] args) 
    { 
        int shopNo; 
        double amount = 0.0; 
        int count = 0; int discount = 0; 
        Scanner input = new Scanner(System.in); 
        ArrayList < Integer> shopList = new ArrayList < >();
        
        do 
        { 
            System.out .println("Enter the shop no. (1 to 20) on which you want to do shopping (-1 to exit) :"); 
            shopNo = input.nextInt(); 
            
            if (shopNo >= 1 && shopNo <= 20) 
            { 
                System.out.println("Welcome to Shop No-" + shopNo); 
                System.out.println("Enter the purchasing amount :"); 
                amount = amount + input.nextDouble(); shopList.add(shopNo); 
            } 
        } while (shopNo != -1); 
        for (int i = 1; i < shopList.size(); i++) 
        { 
            if (!Objects.equals(shopList.get(i), shopList.get(i - 1))) 
            { 
                if (count == 3) break; else count++; 
            } 
        } System.out.println("Total Amount before discount : $" + amount); 
        if (amount >= 100 && count >= 3) 
        { 
            discount = 10; 
        } 
        System.out.println("Applied Discount : $" + discount); 
        System.out.println("Total Amount after discount : $" + (amount - discount)); 
    } 
}
    

