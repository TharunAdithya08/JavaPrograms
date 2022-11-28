import java.util.*;

class Parent
{
    Scanner sc = new Scanner(System.in);
    int a,b;
    // void dispSum()
    // {
    //     System.out.println(a+b);
    // }
    Parent()
    {
        System.out.println("Enter the values of a & b:");
        a = sc.nextInt();
        b = sc.nextInt();
    }

    Parent(int a,int b)
    {
        this.a = a;
        this.b = b;
    }
}

class Child extends Parent
{
    
    Child()
    {
        super(100,200);
        System.out.println("Enter the 2 values of child class:");
        this.a = sc.nextInt();
        this.b = sc.nextInt();
        
    }
    void dispSum()
    { 
        System.out.println("Sum of base class variables: " + (super.a + super.b));
        System.out.println("Sum of current class variable: " + (this.a + this.b));
    }
}

public class chumma 
{
    // public static void main(String args[])
    // {
    //     System.out.println("Hello world");
    //     int num = chumma.main(2,3);
    //     System.out.println(num);              --------------> Main method overloading
    // }    

    // public static int main(int a,int b)
    // {
    //     return (a+b);
    // }

    // public static void main(String args[])
    // {
    //     Parent obj = new Child();
    //     Parent obj1 = new Parent();
    //     obj1.dispSum();
    //     obj.dispSum();

    // }

    public static void main(String args[])
    {
        Child c = new Child();
        c.dispSum();
    }
}
