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
   public static void main(String[] args)
   {
      Student fred = new Student(100);
      System.out.println("Please enter values, Q to quit:");
      Scanner in = new Scanner(System.in);
      while (in.hasNextDouble())
      {  
         if (!fred.addScore(in.nextDouble()))
         {
            System.out.println("Too many scores.");
            return;
         }
      }

      int pos = fred.minimumPosition();
      if (pos == -1)
      {
         System.out.println("At least one score is required.");
      }
      else
      {
         double total = fred.removeMinimum();
         System.out.println("Final score: " + total);
      }
   }
}

