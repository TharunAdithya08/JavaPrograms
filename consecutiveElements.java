import java.util.Scanner;

public class consecutiveElements 
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int arr[],size;
        System.out.println("Enter the size:");
        size = sc.nextInt();
        arr = new int[size];
        System.out.println("Enter the elements into the array:");
        for(int i=0;i<size;i++)
        {
            arr[i] = sc.nextInt();
        }
        int streak=0,longestStreak=0;
        for(int i=1;i<size;i++)
        {
            if(streak>longestStreak)
                longestStreak = streak;
            
            if(arr[i]>arr[i-1])
            {
                streak++;
            }
            else    
                streak = 0;
        }

        System.out.println("The longest consecutive elements length is: "+(longestStreak+1));
    }    
}
