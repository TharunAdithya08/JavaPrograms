import java.util.*;

public class countOfVowelsUsingArray 
{
    
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String[] arr;
        int size;
        System.out.println("Enter the number of words to be entered:");
        size = Integer.parseInt(sc.nextLine());
        arr = new String[size];
        System.out.println("Enter the words to be entered:");
        for(int i=0;i<size;i++)
        {
            arr[i] = sc.nextLine();
        }
        for(int i=0;i<size;i++)
        {
            count(arr,i);
        }
    }

    public static void count(String[] arr,int i)
    {
        int vowels=0,consonants=0,spclCharacters=0;
        String word = arr[i];
        int ch;
        for(int j=0;j<word.length();j++)
        {
            ch = word.charAt(j);
            if(ch>=65 && ch<=90)
            {
                if(ch==65||ch==69||ch==73||ch==79||ch==85)
                    vowels++;
                else
                    consonants++;
            }
            else if(ch>=97 && ch<=122)
            {
                if(ch==97||ch==101||ch==105||ch==111||ch==117)
                    vowels++;
                else    
                    consonants++;
            }
            else  
                spclCharacters++;
        }
        System.out.print("Word:"+(i+1)+" "+word+", vowels: "+vowels+", consonants: "+consonants+", special characters: "+spclCharacters);
        System.out.println();
    }
}
