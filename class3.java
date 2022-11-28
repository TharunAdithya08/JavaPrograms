import java.util.*;

class Person
{
    int sal = 100;
    void prop()
    {
        System.out.println("I'm a person");
    }
}

class Student extends Person
{
    void set()
    {
        this.sal = 200;
    }
    void display()
    {
        System.out.println(this.sal);
        this.prop();
        System.out.println(" also a student!");
    }
}

public class class3
{
    public static void main(String args[])
    {
        Student obj1 = new Student();
        obj1.set();
        obj1.display();
    }
}
