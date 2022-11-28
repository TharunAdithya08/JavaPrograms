import java.util.*;

public class Multithreading implements Runnable 
{
    public void run()
    {
        System.out.println("Running :" + Thread.currentThread().getName());

        // for(int i=0;i<10;i++)
        // {
        //     try 
        //     {
        //         System.out.println("User created thread");
        //     }
        //     catch(Exception e)
        //     {
        //         System.out.println(e);
        //     }
        // }

        // for(int i=0;i<4;i++)
        // {
        //     try
        //     {
        //         Thread.sleep(1000);
        //         System.out.println(i);
        //     }
        //     catch(Exception e)
        //     {
        //         System.out.println(e);
        //     }
        // }
    }

    public static void main(String args[])
    {


        Multithreading obj1 = new Multithreading();
        Multithreading obj2 = new Multithreading();
        Multithreading obj3 = new Multithreading();
        Thread tobj1 = new Thread(obj1);
        Thread tobj2 = new Thread(obj2);
        Thread tobj3 = new Thread(obj3);
        tobj1.start();
        tobj2.start();
        tobj3.start();
        tobj1.setPriority(1);
        tobj2.setPriority(3);
        tobj3.setPriority(2);


        // tobj.setDaemon(false);
        // tobj.start();

        // Multithreading obj1 = new Multithreading();
        // Multithreading obj2 = new Multithreading();
        // Thread tobj1 = new Thread(obj1);
        // Thread tobj2 = new Thread(obj2);
        // tobj1.start();
        // tobj2.start();
    }
}
