public class commandLine1 
{
    public static void printAverage(String []nums)
    {
        try
        {
            float sum = 0;
            for(int i=0;i<nums.length;i++)
            {
                sum += Float.parseFloat(nums[i]);
            }
            sum /= (float)nums.length;
            System.out.println("Average is: "+sum);
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }    

    public static void main(String args[])
    {
        printAverage(args);
    }
}
