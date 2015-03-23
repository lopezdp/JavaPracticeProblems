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
public class ResControl {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        boolean closed = false;
        boolean t1 = true;
        int menuSelect;
        int numGuest;
        Scanner userInput;
        userInput = new Scanner(System.in);
        
        GroupSeating reservationSys = new GroupSeating();
        
        while(t1)
        {
            menuSelect = reservationSys.programMenu(closed);

            if(menuSelect == 1)
            {
                boolean t = true;            
                while(t)
                {
                    System.out.print ("Enter # of Guests in Group: ");
                    if(userInput.hasNextInt())
                    {
                        numGuest = userInput.nextInt();
                        if(numGuest > 0)
                        {
                            reservationSys.setGrSiz(numGuest);
                            
                            if((reservationSys.getGrSiz() + reservationSys.getBarSiz()) == 100)
                            {
                                System.out.println("You are at Max Capacity!!! ");
                                System.out.println("The amount of people seated "
                                        + "in the Oyster Bar is: " 
                                        + (reservationSys.getBarSiz()+reservationSys.getGrSiz()));
                                System.out.print ("Enter Q to QUIT the Program & Close: ");
                                while(!userInput.hasNext("[Qq]"))
                                {
                                    System.out.print("PLEASE ENTER Q TO QUIT!!!");
                                    userInput.next();
                                }
                                String exit = userInput.next();
                                System.out.println("Thank you. The program is shutting down..." + exit);
                                
                                System.exit(0);

                                break;
                            }
                            
                            while((reservationSys.getGrSiz() + reservationSys.getBarSiz()) > 100)
                            {
                                System.out.println("There is not enough seating "
                                        + "available for your party. Please enter a party "
                                        + "with guest amount less than or equal to: " 
                                        + (100 - reservationSys.getBarSiz()));
            
                                reservationSys.setGrSiz(0);
                                
                                System.out.print ("Enter # of Guests in the next Group: ");
                                
                                numGuest = userInput.nextInt();
                                reservationSys.setGrSiz(numGuest);
                            }
                            
                            reservationSys.setBarStd(numGuest);
                                                                               
                            t = false;
                        }
                        else
                        {
                            System.out.println("Error!!! This is not a valid input!!!"
                                    + "For security purposes we have recorded your IP address."
                                    + "Please enter a valid input.");
                        }                
                    }
                    else
                    {
                        System.out.println("Error!!! This is not a valid input!!!"
                                + "For security purposes we have recorded your IP address."
                                + "Please enter a valid input.");
                        
                        t = false;
                    }
                    reservationSys.setGrSiz(0);
                }
            }
            
            if(menuSelect == 2)
            {
                boolean t = true;            
                while(t)
                {
                    System.out.print ("Enter # of Guests leaving Bar: ");
                    if(userInput.hasNextInt())
                    {
                        numGuest = userInput.nextInt();
                        if(numGuest > 0)
                        {
                            reservationSys.setGrSiz(-(numGuest));
                            reservationSys.setBarStd(numGuest);
                            reservationSys.setClosed();
                            
                            t = false;
                        }
                        else
                        {
                            System.out.println("Error!!! This is not a valid input!!!"
                                    + "For security purposes we have recorded your IP address."
                                    + "Please enter a valid input.");
                        }                
                    }
                    else
                    {
                        System.out.println("Error!!! This is not a valid input!!!"
                                + "For security purposes we have recorded your IP address."
                                + "Please enter a valid input.");
                    }
                }
            }
            
            System.out.println("Available Seating is: " + (100 - reservationSys.getBarSiz()));
            
            reservationSys.setGrSiz(0);
            
            if(reservationSys.getBarSiz() == 100)
            {
                System.out.println("You are at Max Capacity!!! "
                        + "The Program has TERMINATED & the BAR IS NOW CLOSED");
                
                t1 = false;
                System.exit(0);

            }
        }    
    }   
}
