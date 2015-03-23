/**
 * David P. Lopez
 * COP2800 Test-2
 * Programming Assignment
 */
package oysterBar;
import java.util.Scanner;

/**
 * 305.467.5719
 * @author david.lopez016@mymdc.net
 */
public class GroupSeating {
    
    //instance variables
    private final int MAX = 100;
    private int grSiz;
    private int barStd;
    private boolean closed = false;
    
    //constructors
    public GroupSeating()
    {
        grSiz = 0;
        barStd = 0;
    }   
    
    //methods
    public int programMenu(boolean closed)
    {
        Scanner userInput;
        userInput = new Scanner(System.in);
        
        int menuSelect = 0;
        boolean t = true;
        while(t)
        {
            System.out.println(" ");
            System.out.println("Please select from one of the following options: ");
            System.out.println("1. Group Arrival");
            System.out.println("2. Group Departure");
            System.out.println("3. Quit & EXIT ---> Terminate Program");
            System.out.println(" ");
            
            System.out.print("Your input is: ");
            
            if(userInput.hasNextInt())
            {
                menuSelect = userInput.nextInt();
                if(menuSelect < 1 || menuSelect > 3)
                {
                    System.out.println("Error!!! This is not a valid input!!!"
                        + "For security purposes we have recorded your IP address."
                        + "Please enter a valid input.");
                }
                else if(menuSelect == 3)
                {
                    System.exit(0);
                }
                else
                {
                    return menuSelect;
                }                
            }
            else
            {
                System.out.println("Error!!! This is not a valid input!!!"
                        + "For security purposes we have recorded your IP address."
                        + "Please enter a valid input.");
                t = false;                
                programMenu(closed);
            }
        }      
        return menuSelect;
    }
    
    //setters
    public void setGrSiz(int x)
    {
        grSiz = x;        
    }
    
    public void setBarStd(int x)
    {
        barStd += (grSiz);        
    }
    
    public void setClosed()
    {
        if ((getBarSiz() + getGrSiz()) >= MAX)
        {
            closed = true;
            
        } 
        else if((getBarSiz() + getGrSiz()) < MAX)
        {
            closed = false;
            
        }
    }
    
//getters
    public int getGrSiz()
    {
        return grSiz;
    }
    
    public int getBarSiz()
    {
        return barStd;
    }
}
