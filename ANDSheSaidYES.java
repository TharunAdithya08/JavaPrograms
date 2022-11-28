import java.util.Scanner;

public class ANDSheSaidYES {
    public static void fun(int arr[]){
        int ans = arr[0];
        for(int i=0;i<arr.length;i++){
            ans = (ans & arr[i]);
        }
        if(ans>=0)
            System.out.println("YES");
        else
            System.out.println("NO");

    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int q = sc.nextInt();
        int queries[][] = new int[q][2];
        for(int i=0;i<q;i++){
            for(int j=0;j<2;j++){
                queries[i][j] = sc.nextInt();
            }
        }
        for(int i=0;i<q;i++){
            arr[(queries[i][0])] = queries[i][1];
        }
        while(q-->0){
            fun(arr);
        }
    }
}
