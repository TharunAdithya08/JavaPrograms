import java.util.*;

// class chumma
// {
//     public int a=10;
//     public final int a1=110;
//     public final int a2;

//     chumma()
//     {
//         //this.a1 = 23; throws ERROR
//         this.a2 = 230;
//         System.out.println(this.a1+" "+this.a2);
//     }
// }

abstract class Animal
{
//abstract method
public abstract void sound();
}

public class Final extends Animal 
{
    public void sound()
    {
        System.out.println("Woof");
    }
    public static void main(String args[])
    {
        Animal obj = new Final();
        obj.sound();
    }
        
}
