import java.util.*;

class Item
{
    Scanner sc = new Scanner(System.in);
    public int id;
    public String descr;
    public int quantity;
    public double price;
    
    Item(int id)
    {
        System.out.println("Enter the description:");
        this.descr = sc.nextLine();
        System.out.println("Enter quantity:");
        this.quantity = sc.nextInt();
        System.out.println("Enter price:");
        this.price = sc.nextDouble();
    }
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

public class shoppingCart extends Item
{

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        shoppingCart obj1 = new shoppingCart();
        shoppingCart obj2 = new shoppingCart();
        obj1.getDetails();

    }    
}
