/**
 * David P. Lopez
 * COP2800 Student Grades HW E7.5
 * Programming Assignment
 */
package grades;
/**
 * 305.467.5719
 * @author david.lopez016@mymdc.net
 */
public class Student
{
   private double[] scores;
   private int scoresSize;

   /**
      Constructs a student with no scores and a maximum number of scores.
      @capacity the maximum number of scores for this student
   */
   public Student(int capacity)
   {
      scores = new double[capacity];
      scoresSize = 0;
   }

   /**
      Adds a score for this student.
      @param score the score to add
      @return true if the score was added, false if there was no room to add the score
   */
   public boolean addScore(double score)
   {
      if (scoresSize < scores.length)
      {
         scores[scoresSize] = score;
         scoresSize++;
         return true;
      }
      else
      {
         return false;      
      }
   }
   
   /**
      Gets the position of the minimum score.
      @return the position of the smallest element of values, or -1
      if there are no scores.
   */
   public int minimumPosition()
   {
      if (scoresSize == 0) { return -1; }
      int smallestPosition = 0;
      for (int i = 1; i < scoresSize; i++)
      {
         if (scores[i] < scores[smallestPosition])
         {
            smallestPosition = i;
         }
      }
      return smallestPosition;
   }

   /**
      Computes the sum of the scores
      @return the total score
   */
   public double sum()
   {
      double total = 0;
      for (int i = 0; i < scoresSize; i++)
      {
         total = total + scores[i];
      }
      return total;
   }     

   /**
      Removes a score at a given position.
      @param pos the position of the score to remove
   */
   public void removeScore(int pos)
   {
      // Remove the element at this position--see Section 7.3.6
      scores[pos] = scores[scoresSize - 1];
      scoresSize--;
   }
   
   /**
      Removes the minimum score.
      @minScore returns the total score minus the minimum Score
   */
   public double removeMinimum()
   {
       if (scoresSize == 0) { return 0; }
       double minScore = 100;
       double total = 0;
       for (int i = 0; i < scoresSize; i++)
       {
           if (minScore > scores[i])
           {
               minScore = scores[i];
           }
           
           total += scores[i];
       }
       return total - minScore;
   }
   
}

