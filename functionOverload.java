// import java.util.*;

// class CalculateArea
// {
//     public void area(int a)
//     {
//         System.out.println("The area of square is:"+(a*a));
//     }
//     public void area(int len,int brd)
//     {
//         System.out.println("Area of rectangle is: "+ (len*brd));
//     }
//     public float area(float radius,float pi)
//     {
//         return (r*r)*3.14;
//     }
// }

// public class functionOverload 
// {
//     public static void main(String args[])
//     {
//         CalculateArea ar = new CalculateArea();
//         ar.area(4.04,3.14);
//         ar.area(10,20);
//         float num = ar.area(5);
//         System.out.println(num);
//     }    
// }

import java.util.*;
import java.io.*;

class Animal
{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    PrintWriter pr = new PrintWriter(System.out,true);
    int age;
    Animal() throws IOException
    {
        pr.println("Enter the age of the animal:");
        this.age = br.read();
    }

    public void disp()
    {
        pr.println("Age: "+this.age);
    }
}

class Dog extends Animal
{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    PrintWriter pr = new PrintWriter(System.out,true);
    Dog()
    {
        pr.println("Enter the age of the dog:");
        this.age = br.read();
    }

    public void disp()
    {
        pr.println("Age of dog: "+this.age);
        pr.println("Age of parent class: "+super.age);
    }
}

public class functionOverload
{
    public static void main(String args[]) throws IOException
    {
        // Dog dobj = new Dog();
        // dobj.disp;
        Animal obj = new Animal();
        obj.disp();
        Animal obj2 = new Dog();
        obj2.disp();

    }
}