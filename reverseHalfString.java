import java.util.*;

public class reverseHalfString {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        if(str.length()%2==0){
            char arr1[],arr2[];
            int temp =0;
            arr1 = new char[str.length()/2];
            arr2 = new char[str.length()/2];
            for(int i=str.length()/2 - 1;i>=0;i--){
                arr1[temp++] = str.charAt(i);
            }
            temp = 0;
            for(int i=str.length()-1;i>=str.length()/2;i--){
                arr2[temp++] = str.charAt(i);
            }
            for(int i=0;i<arr1.length;i++){
                System.out.print(arr1[i]);
            }
            for(char ch:arr2){
                System.out.print(ch);
            }
        }
        else{
            char arr1[],arr2[];
            int temp=0;
            arr1 = new char[str.length()/2];
            arr2 = new char[str.length()/2];
            for(int i=str.length()/2 - 1;i>=0;i--){
                arr1[temp++] = str.charAt(i);
            }
            temp = 0;
            for(int i=str.length()-1;i>str.length()/2;i--){
                arr2[temp++] = str.charAt(i);
            }
            for(char ch:arr1){
                System.out.print(ch);
            }
            System.out.print(str.charAt(str.length()/2));
            for(char ch:arr2){
                System.out.print(ch);
            }
        }
    }
}
