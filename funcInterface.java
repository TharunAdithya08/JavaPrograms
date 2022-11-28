@FunctionalInterface
interface Square
{
    public void square(int num);
}

public class funcInterface 
{
    public static void main(String args[])
    {
        Square ans = (int num) -> {
            int res = num * num;
            System.out.println("The square of the given number is: "+res);
        };
        ans.square(6);
        ans.square(5);
    }
}
