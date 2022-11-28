import java.util.*;
import java.lang.Math;

public class multiplicationOf2BinaryNumbers{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st binary number:");
        String b1 = sc.nextLine();
        System.out.println("Enter 2nd binary number:");
        String b2 = sc.nextLine();
        int b_1,b_2;
        int sum = 0,temp=0;
        for(int i=b1.length()-1;i>=0;i--){
            if(b1.charAt(i)=='0'){
                sum += 0;
                temp++;
            }
            else
                sum += Math.pow(2,temp++);
        }
        b_1 = sum;
        sum = 0;
        temp = 0;
        for(int i=b2.length()-1;i>=0;i--){
            if(b2.charAt(i)=='0'){
                temp++;
                sum += 0;
            }
            else{
                sum += Math.pow(2,temp++);
            }
        }
        b_2 = sum;
        System.out.println("Multiplied value of 2 binary numbers is: "+(b_1 * b_2));
    }
}