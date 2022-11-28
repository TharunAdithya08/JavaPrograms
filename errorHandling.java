import java.util.*;

class InvalidNumberException extends Exception
{
    public InvalidNumberException(String str)
    {
        super(str);
    }
}

public class errorHandling 
{
    public static void check(String[] arr) throws InvalidNumberException
    {
        int sum = 0;
        int len = arr.length;
        for(int i=0;i<len;i++)
        {
            if(Integer.parseInt(arr[i])<=0)
            {
                throw new InvalidNumberException("Not a positive number");
            
            }
            else
            {
                sum += Integer.parseInt(arr[i]);
            }
        }
        float avg = (float)sum/(float)len;
        System.out.println("The average is: "+ avg);

    }
    public static void main(String args[])
    {
        try
        {
            check(args);
        }
        catch(InvalidNumberException ex)
        {
            System.out.println("Exception occured: "+ ex);
        }
        finally
        {
            System.out.println("End of main method!");
        }
    }
}