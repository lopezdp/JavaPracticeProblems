/**
 * 305.467.5719
 * @author david.lopez016@mymdc.net
 */
public class Student 
{
    private double[] scores;
    private double arrSize;
    
    public Student(int capacity)
    {
        arrSize = capacity;
        scores = new double[capacity];
        for(int i = 0; i < arrSize; i++)
        {
            scores[i] = -1;
        }
    }
    
    public boolean addScore(double score)
    {
        boolean ret = true;
        for(int i = 0; i < arrSize; i++)
        {
            if(scores[i] < 0)
            {
                scores[i] = score;
            }
            else if(scores[i] >= 0)
            {
                ret = false;
            }
        }
        return ret;
    }
    
    public double sum()
    {
        double sum = 0;
        for(int i = 0; i < arrSize; i++)
        {
            sum += scores[i];
        }
        return sum;
    }
    
    public double minimum()
    {
        double min = scores[0];
        for(int i = 0; i < arrSize; i++)
        {
            if(scores[i] < min)
            {
                min = scores[i];
            }
        }
        return min;
    }
    
    public double finalScore()
    { 
         if(arrSize == 0)
         {
             return 0;
         }
         else if(scores.length == 1)
         {
             return scores[0];
         }
         else
         {
             return sum() - minimum();
         }
    }
}
