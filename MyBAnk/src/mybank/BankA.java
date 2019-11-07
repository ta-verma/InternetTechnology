package mybank;


import java.util.ArrayList;


public class BankA {
    static ArrayList<MyBank> arr;

    public BankA()
    {
        arr = new ArrayList<>();
    }
    public static void addAccount(long accNo,double balance)
    {
        MyBank M = new MyBank(accNo,balance);
        arr.add(M);
    }
   static void addBalance(long accNo,double ammount){
       int n = arr.size();
       int i;
        for( i = 0; i < n; i++)
        {
            if(arr.get(i).accNo==accNo) break;
        }
       arr.get(i).deposit(ammount);
   }
   static void rmBalance(long accNo,double ammount){
       int n = arr.size();
       int i;
        for( i = 0; i < n; i++)
        {
            if(arr.get(i).accNo==accNo) break;
        }
        arr.get(i).withdrawl(ammount);
       
   }
    static double totalBalance()
    {
        double temp = 0;
        int n = arr.size();
        for(int i = 0; i < n; i++)
        {
            temp = temp + arr.get(i).balance;
        }
        return temp;
    }
    
}
