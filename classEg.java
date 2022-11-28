import java.util.*;

class Item
{
    Scanner sc = new Scanner(System.in);
    public int id;
    public String descr;
    public int quantity;
    public double price;
    
    Item()
    {
        System.out.println("Enter id:");
        this.id = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter the description:");
        this.descr = sc.nextLine();
        System.out.println("Enter quantity:");
        this.quantity = sc.nextInt();
        System.out.println("Enter price:");
        this.price = sc.nextDouble();
    }

    public void getDetails()
    {
        System.out.println("ID: "+this.id);
        System.out.println("Quantity: "+this.quantity);
        System.out.println("Description: "+this.descr);
        System.out.println("Price: "+this.price);
    }
}

public class classEg 
{

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        Item[] arr;
        System.out.println("How many items to insert?");
        int num = sc.nextInt();
        arr = new Item[num];
        for(int i=0;i<num;i++)
        {
            arr[i] = new Item();
        }
        for(int i=0;i<num;i++)
            arr[i].getDetails();
    }    
}
