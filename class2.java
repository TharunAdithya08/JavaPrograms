import java.util.*;

class class2
{  
    public int id;  
    public String name;  
    class2()
    {
        ;
    }
    class2(int i,String n)
    {  
        id = i;  
        name = n;  
    }  
    void display()
    {
        System.out.println(id+" "+name);
    }  
   public static void main(String args[])
   {  
        class2 s1 = new class2();  
        class2 s2 = new class2(222,"Aryan");  
        s1.display();  
        s2.display();     
    }  
} 

