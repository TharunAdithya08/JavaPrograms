import java.util.*;

class Node{
    int data;
    Node leftChild;
    Node rightChild;

    // Node(){
    //     leftChild = null;
    //     rightChild = null;
    // }
    Node(int data){
        this.data = data;
        leftChild = null;
        rightChild = null;
    }
}

class BST{
    Node root;
    void insert(int val){
        Node newNode = new Node(val);
        if(root==null){
            root = newNode;
        }
        else{
            Node temp = root;
            while(true){
                if(temp.data < val){
                    if(temp.rightChild == null){
                        temp.rightChild = newNode;
                        return;
                    }
                    else{
                        temp = temp.rightChild;
                    }
                }
                else if(temp.data > val){
                    if(temp.leftChild == null){
                        temp.leftChild = newNode;
                        return;
                    }
                    else{
                        temp = temp.leftChild;  
                    }
                }
            }
        }
    }

    void inOrder(Node root){
        Node temp = root;
        if(root!=null){
            inOrder(root.leftChild);
            System.out.print(root.data+" ");
            inOrder(root.rightChild);
        }
    }
}

public class binarySearchTree {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        BST bt = new BST();
        int n = sc.nextInt();
        for(int i=0;i<n;i++)
            bt.insert(sc.nextInt());
        System.out.println("Inorder traversal of the binary search tree is :");
            bt.inOrder(bt.root);
    }
}
