import java.util.*;

public class matrixMult 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int size;
        System.out.println("Enter the size of array:");
        size = sc.nextInt();
        int[][] arr1,arr2,res_arr;
        arr1 = new int[size][size];
        arr2 = new int[size][size];
        res_arr = new int[size][size];
        arr1 = entry(arr1,size);
        arr2 = entry(arr2,size);

        for(int i=0;i<size;i++)
        {
            for(int j=0;j<size;j++)
            {
                for(int k=0;k<size;k++)
                {
                    res_arr[i][j] += arr1[i][k]*arr2[k][j]; 
                }
            }

        }
        System.out.println("Resultant matrix is:");
        for(int i=0;i<size;i++)
        {
            for(int j=0;j<size;j++)
            {
                System.out.print(res_arr[i][j]+" ");
            }
            System.out.println();
        }
    }   

    public static int[][] entry(int[][] arr,int size)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the elements into the array:");
        for(int i=0;i<size;i++)
        {
            for(int j=0;j<size;j++)
            {
                arr[i][j] = sc.nextInt();
            }
        }
        return arr;
    }

}
