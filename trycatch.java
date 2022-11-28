//CUSTOM EXCEPTION

import java.util.*;

class InvalidNumberException extends Exception
{
    public InvalidNumberException(String str)
    {
        super(str);    
    }
}

public class trycatch
{
    public static void check(int num) throws InvalidNumberException
    {
        if(num<=0)
        {
            throw new InvalidNumberException("Number not positive");
            
        }
        else
            System.out.println("good to go");
    }

    public static void main(String args[])
    {
        for(int i=0;i<args.length;i++)
        {
            int num = Integer.parseInt(args[i]);
            try
            {
                check(num);
            }
            catch(InvalidNumberException ex)
            {
                System.out.println("Exception occured: "+ex);
            }

        }
    }
}

// import java.util.*;

// public class trycatch extends Exception
// {   
//     public void InvalidAgeException()
//     {
//         System.out.println("You must be greater than 18 to vote!");
//     }
//     public void validate(int age)
//     {
//         try
//         {
//             if(age<18)
//             {
//                 throw new InvalidAgeException();
//             }
//             else    
//             {
//                 System.out.println("Welcome to vote!");
//             }
//         }
//         catch(InvalidAgeException m)
//         {
//             System.out.println("Error occured: " + m);
//         }
//     }
//     public static void main(String args[])
//     {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter age:");
//         int age = sc.nextInt();
//         trycatch tc = new trycatch();

//         tc.validate(age);
//         // int res;
//         // for(int i=-3;i<=3;i++)
//         // {
//         //     try
//         //     {
//         //         res = num/i;
//         //         System.out.println(res);
//         //     }
//         //     catch(Exception e)
//         //     {
//         //         System.out.println("Cannot be divided by 0");
//         //     }
//         //     finally
//         //     {
//         //         System.out.println("this is the final block");
//         //     }
//         // }
        
//     }
// }
