import java.util.*;
public class sortingCdL
{
    public static void main(String args[])
    {
        // String r = (0>1)? "true":"false";
        // System.out.println(r);
        int arr[] = {5,4,3,2,1};
        int len = args.length;
        for(int i=0;i<len;i++)
        {
            for(int j=i+1;j<len;j++)
            {
                if(Integer.parseInt(args[j]) < Integer.parseInt(args[i]))
                // if(arr[j]<arr[i])
                {
                    String temp = args[j];
                    args[j] = args[i];
                    args[i] = temp;
                }
            }
        }
        for(int i=0;i<len;i++)
            System.out.println(args[i]);
    }    
}
