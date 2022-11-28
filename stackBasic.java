import java.util.*;

public class stackBasic{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        StringBuffer s = new StringBuffer(str);
        System.out.println(s);
        System.out.println(s.reverse());
    }
}