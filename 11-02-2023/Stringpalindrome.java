import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan=new Scanner(System.in);
        String s=scan.nextLine();
       s=s.toLowerCase();
       boolean flag=true;
        int n=s.length();
            for(int i=0;i<n/2;i++){
                if(s.charAt(i)!=s.charAt(n-i-1)){
                   flag=false;
                   break;
                }
            }
            if(flag){
                System.out.println("Palindrome");
            }
            else{
                System.out.println("Not Palindrome"); 
            }
    }  
}
