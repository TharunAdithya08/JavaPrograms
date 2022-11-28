import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
class TestClass 
{
   public static void main(String args[])
   {
       Scanner sc = new Scanner(System.in);
       int size = sc.nextInt();
       int arr[] = new int[size];
       for(int i=0;i<size;i++)
       {
           arr[i] = sc.nextInt();
       }
       for(int i=0;i<size;i++)
       {
            if(arr[i]%2 == 0)
                continue;
            else
            {
                for(int j=i+1;j<size;j++)
                {
                    if(arr[j]%2==0)
                    {
                        int temp = arr[j];
                        arr[j] = arr[i];
                        arr[i] = temp;
                        break;
                    }
                    
                }
            }
       }
       for(int i : arr)
            System.out.print(i + " ");
   }
}
