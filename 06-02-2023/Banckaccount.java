import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
class BanckAccount{
    private String name;
    private int accountNo;
    private int balance;
    BanckAccount(String name,int accountNo,int balance){
        this.name=name;
        this.accountNo=accountNo;
        this.balance=balance;
    }
    public String getName(){
        return name;
    }
    public int getAccountNo(){
        return accountNo;
    }
    public int balance(){
        return balance;
    }
    public void deposit(int amount ){
        balance+=amount;
    }
    public void withdraw(int amount){
        if(amount>balance){
            System.out.println("Negative Balance Transaction Cancelled");
        }
        else{
        balance-=amount;
    }
    }
    public void display(){
      System.out.println(accountNo+" "+name+" "+balance);  
    }
    }
public class Solution {
    public static void main(String[] args) {
         Scanner in = new Scanner(System.in);
        int accountNo=Integer.parseInt(in.nextLine());
       String name=in.nextLine();
      int n=Integer.parseInt(in.nextLine());
      int balance=0;
      BanckAccount a=new BanckAccount(name,accountNo,balance);
      for(int i=0;i<n;i++){
        String[] arr= in.nextLine().split(" ");
        if(arr[0].equals("Deposit")){
          int k=Integer.parseInt(arr[1]);
          a.deposit(k);
        }
        else if(arr[0].equals("Withdraw")){
          int m=Integer.parseInt(arr[1]);
          a.withdraw(m);
        }
        else if(arr[0].equals("Display")){
  
          a.display();
        }
      }  
    }
}
