import java.util.*;
public class compressString {
    public static void main(String args[])
    { 
            ArrayList<String> list=new ArrayList<String>();  
                    list.add("Ravi");  
                    list.add("Vijay");  
                    list.add("Ajay");  
                      
                    HashSet<String> set=new HashSet(list);  
                    set.add("Gaurav");  
                    Iterator<String> i=set.iterator();  
                    while(i.hasNext())  
                    {  
                    System.out.println(i.next());  
                    }  

        // Scanner sc = new Scanner(System.in);
        // String str = sc.nextLine();
        // int count = 0;
        // char temp = str.charAt(0);
        // for(int i=1;i<str.length();i++)
        // {
        //     if(str.charAt(i)==temp)
        //     {
        //         count++;
        //         temp = str.charAt(i);
        //     }
        // }

        // int countArr[] = new int[count];
        // int size = -1;
        // count = 0;
        // temp = str.charAt(0);
        // for(int i=0;i<str.length();i++)
        // {
        //     if(i!=str.length()-1)
        //     {
        //         if(str.charAt(i)==temp)
        //             count++;
        //         else    
        //         {
        //             countArr[++size] = count;
        //             count = 1;
        //             temp = str.charAt(i);
        //         }
        //     }
        //     else
        //     {
        //         if(str.charAt(i)==temp)
        //         {
        //             countArr[++size] = ++count;
        //         }
        //         else
        //         {
        //             countArr[++size] = 1;
        //         }
        //     }
        // }
        // count = -1;
        // temp = str.charAt(0);
        // for(int i =0;i<str.length();i++){
        //     if(i!=str.length()-1)
        //     {
        //         if(str.charAt(index)!=temp)
        //         {
        //             System.out.print(temp+countArr[++count]);
        //             temp = str.charAt(i);
        //         }
        //     }
        //     else
        //     {
        //         if(str.charAt(i)==temp)
        //             System.out.print(temp+countArr[++count]);
        //         else
        //             System.out.print(str.charAt(str.length()-1)+countArr[++count]);
        //     }
        // }
    }
}
