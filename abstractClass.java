import java.util.*;
abstract class Bank
{
    public abstract void getBalance();
}

class BankA
{
    float balance;
    public void getBalance()
    {
        System.out.println("Balance in Bank A: $"+this.balance);
    }
}

class BankB
{
    float balance;
    public void getBalance()
    {
        System.out.println("Balance in Bank B: $"+this.balance);
    }
}

class BankC
{
    float balance;
    public void getBalance()
    {
        System.out.println("Balance in Bank C: $"+this.balance);
    }
}

public class abstractClass 
{
    public static void main(String args[])
    {
        BankA a = new BankA();
        BankB b = new BankB();
        BankC c = new BankC();
        a.balance = 100;
        b.balance = 150;
        c.balance = 200;
        a.getBalance();
        b.getBalance();
        c.getBalance();

    }    
}
