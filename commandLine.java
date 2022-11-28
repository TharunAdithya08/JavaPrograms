import java.util.*;

public class commandLine 
{
    public static void main(String args[])
    {
        // int num = Integer.parseInt(args[0]);
        // num++;
        // for(int i = 2; i < num; i++)
        // {
        //     if(num%i == 0) {
        //         num++;
        //         i=2;
        //     } else {
        //         continue;
        //     }
        //     System.out.println(num);
        // }
        //System.out.println("the first argument is: "+args[0]);

        int num1 = Integer.parseInt(args[0]);
        int num2 = Integer.parseInt(args[1]);
        System.out.println("First number is: "+num1+"\nSecond number is: "+num2);
        System.out.println("Added value of these two numbers are: "+(num1+num2));
    }    
}
