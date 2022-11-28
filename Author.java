/*
Author of the book((FINAL))
*/
import java.util.Scanner;

public class Main
{
    
	public static void main(String[] args)
	{
	    String name,email;
	    char gender;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your name:");
		name = sc.nextLine();
		System.out.println("Enter your email ID:");
		email = sc.nextLine();
		System.out.println("Enter your Gender(M/F):");
		gender = sc.next().charAt(0);
		Main obj = new Main(name,email,gender);
		System.out.println("Your name is: " + obj.getName());
		System.out.println("Your email ID is: " + obj.email);
		System.out.println("Your gender is: " + obj.gender);
		obj.setAuthor();
		obj.setPrice();
		obj.setQtyInStock();
		System.out.println("The author of the book is: " + obj.getAuthor());
		System.out.println("The price of the book is: " + obj.getPrice());
		System.out.println("No of books available is: " + obj.getQtyInStock());
		
	}
	
	private String name;
	private String email;
	private char gender;
	private String author;
	private double price;
	private int qtyInStock;
		
	public Main(String name,String email,char gender)
	{
		this.name = name;
		this.email = email;
		this.gender = gender;
		this.qtyInStock = qtyInStock;
	}
	
	public void setAuthor()
	{
	    Scanner sc = new Scanner(System.in);
	    System.out.println("Enter the name of the author:");
	    this.author = sc.nextLine();
	}
	
	public void setPrice()
	{
	    Scanner sc = new Scanner(System.in);
		System.out.println("Enter the price of the book:");
		this.price = sc.nextDouble();
	}
	
	public void setQtyInStock()
	{
	    Scanner sc = new Scanner(System.in);
		System.out.println("Enter the quantity in stock:");
		this.qtyInStock = sc.nextInt();
	}
	
	public String getName()
	{
		return name;
	}
	
	public String getAuthor()
	{
		return author;
	}
	
	public double getPrice()
	{
		return price;
	}
	
	public int getQtyInStock()
	{
		return qtyInStock;
	}
	

}
