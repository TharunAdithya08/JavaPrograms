import java.util.*;

class Node
{
    int data;
    Node next;
    Node(){
        next = null;
    }
    Node(int n)
    {
        data = n;
        next = null;
    }
}

class LinkedList
{
    void insert(Node head,int x)
    {
        Node temp = head;
        Node newNode = new Node(x);
        while(temp.next != null)
        {
            temp = temp.next;
        }
        temp.next = newNode;
    }
    
    void display(Node head)
    {
        Node temp = head.next;
        while(temp.next!=null)
        {
            System.out.println(temp.data);
            temp = temp.next;
        }
        System.out.println(temp.data);
    }
}

public class linkedListFinal
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        Node head = new Node();
        LinkedList ll = new LinkedList();
        int n = sc.nextInt();
        for(int i=0;i<n;i++)    
            ll.insert(head,sc.nextInt());
            
        ll.display(head);
    }
    
}
