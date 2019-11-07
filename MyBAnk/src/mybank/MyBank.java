package mybank;

public class MyBank
{
    long accNo;
    double balance;
    
   
    public MyBank(long acc,double bal)
    {
        accNo = acc;
        balance = bal;
    }
    
    public void deposit(double bal)
    {
        balance = balance + bal;
    }
    
    public void withdrawl(double bal)
    {
        balance = balance - bal;
    }
    
    public long getAccNo()
    {
        return accNo;
    }
    
    public double getBalance()
    {
        return balance;
    }
}