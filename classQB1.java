import java.util.*;

class Student
{
    Scanner sc = new Scanner(System.in);
    public int roll_no;
    public String name;
    public float marks[] = new float[5];

    Student()
    {
        System.out.println("Enter Student's roll_no:");
        roll_no = sc.nextInt();
        System.out.println("Enter the student's name:");
        sc.nextLine();
        name = sc.nextLine();
        System.out.println("Enter the 5 subject marks:");
        for(int i=0;i<5;i++)
        {
            marks[i] = sc.nextFloat();
        }
    }

    // public void highestMark(int n)
    // {
    //     int rollTopper,highestmarks = 0,sum=0;
    //     String topper; 
    //     for(int i=0;i<n;i++)
    //     {
    //         for(int j=0;j<5;j++)
    //         {
    //             sum += this.marks[j];
    //         }
    //         if(sum > highestmarks)
    //         {
    //             highestmarks = sum;
    //             rollTopper = this.roll_no;
    //             topper = this.name;
    //         }
    //     }
    // }

    public void getDetails()
    {
        System.out.println("Roll NO: "+this.roll_no);
        System.out.println("Name: "+this.name);
        System.out.println("5 subject marks:");
        for(int i=0;i<5;i++)
            System.out.print(this.marks[i]+"\t");
    }

}

public class classQB1 
{
    
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Enter the number of students :");
        n = sc.nextInt();
        Student obj[] = new Student[n];
        for(int i=0;i<n;i++)
        {
            obj[i]= new Student();
        }
        for(int i=0;i<n;i++)
        {
            obj[i].getDetails();
        }

    }   
}
