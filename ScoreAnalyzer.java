/**
 * David P. Lopez
 * COP2800 Student Grades HW E7.5
 * Programming Assignment
 */
package grades;
import java.util.*;
/**
 * 305.467.5719
 * @author david.lopez016@mymdc.net
 */
public class ScoreAnalyzer 
{
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner input = new Scanner(System.in);
        Student fred = new Student(100);

        System.out.println("Please enter values, Q to quit.");

        while(input.hasNextDouble())
        {
            if(!fred.addScore(input.nextDouble()))
            {
                System.out.println("Too many Scores!");
                return;
            }
        }

        System.out.println("Final Score: " + fred.finalScore());
    
    
        
    }
    
    
}
