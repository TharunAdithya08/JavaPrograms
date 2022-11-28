import java.nio.charset.Charset;
import java.util.*;

public class array 
{
    public static int myPrint(int[] a,int n)
    {
        int sum=0;
        for(int i=0;i<n;i++)
        {
            sum+=a[i];
        }
        return sum;
    }
    public static void main(String[] args)
    {
        /*ARRAY_SIZE = arr.length; */
        Scanner sc = new Scanner(System.in);
        // int size;
        // System.out.println("Enter the size of the array:");
        // size = sc.nextInt();
        // int[] arr = new int[size];
        // System.out.println("Enter the values to be inserted into the array:");
        // for(int i=0;i<size;i++)
        // {
        //     arr[i] = sc.nextInt();
        // }
        // ///*ANONYMOUS ARRAY*/ myPrint(new int[]{1,2,3,4,5});
        // int res = myPrint(arr,size);
        // System.out.println(res);
        //System.out.println(arr);

        // int arr[];
        // arr = new int[]{1,2,3,4,5};
        // arr = new int[6];
        // arr[5] = 10;
        // System.out.println(arr[5]);
            
        //char charArray[] = { 'b', 'i', 'r', 't', 'h', ' ', 'd', 'a', 'y' };
        // byte byteArray[] = { ( byte ) 'n', ( byte ) 'e',  ( byte ) 'w', ( byte ) ' ', ( byte ) 'y', ( byte ) 'e', ( byte ) 'a', ( byte ) 'r' };
        // String s = new String( "hello" );
        // String s1 = new String();                 
        // String s2 = new String( s );             
        // String s3 = new String( charArray );      
        // String s4 = new String( charArray, 6, 3 );
        // String s5 = new String( byteArray, 4, 4 );
        // String s6 = new String( byteArray );     
        // String output = "s1 = " + s1 + "\ns2 = " + s2 + "\ns3 = " + s3 + "\ns4 = " + s4 + "\ns5 = " + s5 + "\ns6 = " + s6;
        // System.out.println(output);    
        
        // String s1 = "hello";
        // String s2 = "world";
        // String s3 = s1+s2;
        // System.out.println(s3);
        // int num1 = s3.indexOf("orl",8);
        // System.out.println(num1);
        // char[] arr = new char[30];
        // s3.getChars(3,8,arr,0);
        // for(int i=0;i<arr.length;i++)
        // {
        //     System.out.print(arr[i]+" ");
        // }

        // System.out.println(s3.startsWith("hello"));

        // char[] arr = s3.toCharArr();
        // for(int i=0;i<arr.length;i++)
        // {
        //     System.out.print(arr[i]+" ");

        
        // String str1 = new String("Hello-World-By-Viper-Adi");
        // String[] arr = str1.split("-");
        // for(int i=0;i<arr.length;i++)
        //     System.out.print(arr[i]+" ");

        // String s1= sc.nextLine();
        // String arr[] = s1.split("[^aeiouAEIOU]");
        // for(int i=0;i<arr.length;i++)
        //     {
        //         while(arr[i]!=" ")
        //             System.out.println(arr[i].trim());
        //     }

        // StringBuilder input1 = new StringBuilder("GeeksforGeeks");
        // input1 = input1.reverse();
        // System.out.println(input1);

        // String str1 = new String("VIPER ADI");
        // String str2 = "";
        // for(int i=str1.length()-1;i>=0;i--)
        //     str2 += str1.charAt(i);

        // System.out.println(str2);

        String s1 = "Hello guys do you what time it is?";
        String s2 = sc.nextLine();
        // int len = s2.length();
        // for(int i=0;i<s1.length();i++)
        // {
        //     if((s1.substring(i,i+len+1)).equals(s2))
        //         System.out.println("Word found @: "+i);
            
        // }
        boolean res = s1.equals(s2);
        System.out.println(res);
    }   
}
