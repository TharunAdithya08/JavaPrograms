import java.util.Scanner;

class Stack1
{
    int stack[];
    public int top = -1;
    Stack1(int max)
    {
        stack = new int[max];
    }
    
    public void push(int stack)
    {
        this.stack[++top] = stack;
    }
    
    public void pop()
    {
        System.out.print(this.stack[top--]+" ");
    }
}

public class stackUsingArray 
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n<=0)
            System.out.println("WRONG INPUT");
        else
        {
            Stack1 st = new Stack1(n);
            for(int i=1;i<=n;i++)
            {
                if(n%i==0)
                    st.push(i);
            }
            while(st.top>=0)
            {
                st.pop();
            }
        }
        
    }   
}
