import java.util.*;

interface customer
{
    public void information();
    public void show();
}

public class employee_Class implements customer 
{
    Scanner sc = new Scanner(System.in);
    String name,gender;
    double salary,taxRate;
    public void information()
    {
        System.out.println("Enter your name:");
        this.name = sc.nextLine();
        System.out.println("Enter your gender(male/female):");
        this.gender = sc.nextLine();
        System.out.println("Enter your salary:");
        this.salary = sc.nextDouble();
        if(salary<200000)
        {
            this.taxRate = 0.0;
        }
        else if(salary>=200000 && salary<500000 && gender=="male")
        {
            this.taxRate = salary*((double)10/(double)100);
        }
        else if(salary<500000 && gender == "female")
        {
            this.taxRate = 0.0;
        }
        else if(salary>=500000 && gender == "male")
        {
            this.taxRate = salary*((double)25/100);
        }
        else if(salary>=500000 && gender == "female")
        {
            this.taxRate = salary*((double)20/(double)100);
        }
    }

    public void show()
    {
        System.out.println("Name: "+ this.name);
        System.out.println("Gender: "+this.gender);
        System.out.println("Salary: "+this.salary);
        System.out.println("payable tax amount:"+this.taxRate);
    }

    public static void main(String args[])
    {
        employee_Class person1 = new employee_Class();
        person1.information();
        person1.show();
    }
}
