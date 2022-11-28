import java.util.Scanner;
public class AdamNumber
{
    public static int Reverse(int num)
    {
        int rev_num = 0;
        while(num>0)
        {
            rev_num = rev_num*10 + num%10;
            num = num/10;
        }
        return rev_num;
    }
    
	public static void main(String[] args) 
	{
	    int num2,square1,square2;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		int num1 = sc.nextInt();
		square1 = num1*num1;
		num2 = Reverse(num1);
		square2 = num2*num2;
		if(square1==Reverse(square2))
		{
		    System.out.println("Yes the number is Adam's number!");
		}
		else    
		    System.out.println("No the number is not Adam's number!");
	}
}
