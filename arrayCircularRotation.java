import java.util.*;

public class arrayCircularRotation 
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int size,n;
        System.out.println("Enter the size of the array:");
        size = sc.nextInt();
        int[] arr = new int[size];
        int[] res_arr = new int[size];

        System.out.println("Enter the elements into the array:");
        for(int i=0;i<size;i++)
        {
            arr[i] = sc.nextInt();
        }
        System.out.println("How many circular rotations do you want:");
        n = sc.nextInt();
            
        res_arr = myFunc(arr,n,size);
        System.out.println("New array after rotation:");
        for(int i=0;i<size;i++)
        {
            System.out.print(res_arr[i]+" ");
        }
    }    

    public static int[] myFunc(int arr[],int n,int size)
    {
        int temp;
        for(int i=1;i<=n;i++)
        {
            temp = arr[size-1];
            for(int j=size-1;j>=1;j--)
            {
                arr[j] = arr[j-1];
            }
            arr[0] = temp;
        }
        return arr;
    }
}
