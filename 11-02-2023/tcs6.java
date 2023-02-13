import java.io.*;
import java.util.*;

public class Solution {
  static int fib(int x){
      if(x==0){
          return 0;
      }
      else if(x==1){
          return 1;
      }
      else{
          return fib(x-1)+fib(x-2);
      }
  }
    static int odd(int x){
        return 2*x-1;
    }
    static int value(int x){
        if(x%2!=0){
            return odd((x+1)/2);
        }
        else{
            return fib(x/2);
        }
    }
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        System.out.println(value(n));
    }
}
