import java.util.*;
public class goodTriplets 
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int a,b,c,count=0;
        int arr[] = new int[size];
        for(int i=0;i<size;i++)
            arr[i] = sc.nextInt();
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt(); 
        for(int i=0;i<size-2;i++)
        {
            for(int j=i+1;j<size-1;j++)
            {
                for(int k=j+1;k<size;k++)
                {
                    if(arr[i]-arr[j]<=a && arr[i]-arr[j]>= -a)
                    {
                        if(arr[j]-arr[k]<=b && arr[j]-arr[k]>= -b)
                        {
                            if(arr[i]-arr[k]<=c && arr[i]-arr[k]>= -c)
                            {
                                count++;
                            }
                        }
                    }
                    else
                        continue;
                }
            }
        }

        System.out.println(count);
    }
}


