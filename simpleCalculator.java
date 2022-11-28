import java.util.*;

public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        char symbol;
        int a,b;
        System.out.println("Enter two integers to perform the operation:");
        a = sc.nextInt();
        b = sc.nextInt();
        System.out.println("Enter the operation to be performed(+,-,*,/):");
        symbol = sc.next().charAt(0);
        switch(symbol)
        {
            case '+':
                System.out.println(a+"+"+b+"="+ (a+b));
                break;
            case '-':
                System.out.println(a+"-"+b+"="+ (a-b));
                break;
            case '*':
                System.out.println(a+"*"+b+"="+ (a*b));
                break;
            case '/':
                System.out.println(a+"/"+b+"="+ (a/b));
                break;
            default:
                System.out.println("Invalid operator selected!");
        }
    }
}