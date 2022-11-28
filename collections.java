import java.util.*;

public class collections 
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        ArrayList<String> al = new ArrayList<>();
        for(int i=0;i<str.length();i++)
        {
            al.add(str.charAt(i)+"");
        }
        Set<String> hs = new HashSet<>(al);
        int max=0;
        String maxElement = " ";
        for(String i:hs)
        {
            System.out.println("Frequency of character "+ i +" is: "+ Collections.frequency(al,i));
            if(Collections.frequency(al,i)>max)
            {
                max = Collections.frequency(al,i);
                maxElement = i;
            }
        }
        System.out.println("Element with the max element is: "+maxElement+"-"+max);
    }    
}
