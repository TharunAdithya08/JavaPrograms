import java.util.*;
public class arrayMatrix
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int size = str.length();
        int count = -1,tempi=-1,tempj=5;
        // char arr[] = new char[str.length()];
        // for(int i=0;i<str1.length();i++)
        // {
        //     arr[i] = str.charAt(i);
        // }
        char arr[][] = new char[size][size];
        for(int i=0;i<size;i++)
        {
            for(int j=0;j<size;j++)
            {
                if(i==j)
                    arr[i][j] = str.charAt(++count);
            }
        }
        
        for(int i=0;i<str.length();i++)
            arr[++tempi][--tempj] = str.charAt(tempi);

        for(int i=0;i<size;i++)
        {
            for(int j=0;j<size;j++)
            {
                if(arr[i][j]!=0)
                    System.out.print(arr[i][j]+" ");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}