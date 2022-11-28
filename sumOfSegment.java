import java.util.*;

public class sumOfSegment {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int size = sc.nextInt();
            int q = sc.nextInt();
            int arr[] = new int[size];
            for(int i=0;i<size;i++){
                arr[i] = sc.nextInt();
            }
            int queries[][] = new int[q][3];
            for(int i=0;i<q;i++){
                for(int j=0;j<3;j++){
                    queries[i][j] = sc.nextInt();
                }
            }
            for(int i=0;i<q;i++){
                if(queries[i][0]==1){
                    arr[(queries[i][1])] = queries[i][2];
                }
                else if(queries[i][0]==2){
                    arr[(queries[i][1])] = queries[i][2];
                }
                else if(queries[i][0]==3){
                    int sum = 0;
                    for(int k=queries[i][1];k<=queries[i][2];k++){
                        sum += arr[k];
                    }
                    int temp = queries[i][2]-queries[i][1]+1;
                    if(sum == temp){
                        System.out.println("YES");
                    }
                    else{
                        System.out.println("NO");
                    }
                    System.out.println(sum +" "+temp);
                }
            } 
        }
    }
}
