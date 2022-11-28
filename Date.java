//Date display
import java.util.Scanner;

public class Main 
    {
        
        public static void main(String[] args)
        {
            Main obj1 = new Main();
            obj1.setMonth();
            obj1.setDay();
            obj1.setYear();
            obj1.dispDate();
        }
        private int day;
        private int month;
        private int year;
        Scanner sc = new Scanner(System.in);
        
        public void setMonth()
        {
            System.out.println("Pls enter the month:");
            this.month = sc.nextInt();
            if(month<=12 && month>0)
                this.month = month;
            else
            {
                System.out.println("Invalid month");
                this.month = 0;
            }
        }
        
        public void setDay()
        {
            System.out.println("Pls enter the day according to the month entered:");
            this.day = sc.nextInt();
        }
        
        public void setYear()
        {
            System.out.println("Pls enter the year:");
            this.year = sc.nextInt();
        }
        
        public void getDay()
        {
            System.out.println(this.day);
        }
        
        public void getMonth()
        {
            System.out.println(this.month);
        }
        
        public void getYear()
        {
            System.out.println(this.year);
        }
        
        public void dispDate()
        {
            System.out.println("Date: "+this.day +"/"+ this.month +"/"+ this.year);
        }
        
        public Main()
        {
            this.day = 0;
            this.month = 0;
            this.year = 0;
        }
    }