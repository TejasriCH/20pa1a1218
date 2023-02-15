import java.io.*;
import java.util.*;
public class Solution {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        for(int i=0;i<n;i++){
            String s=scan.next();
            StringBuilder sb=new StringBuilder(s);
            sb.reverse();
            String s1=sb.toString();
            if(s.equals(s1)){
                System.out.println("-1");
            }
            else{
                char[] ch=s.toCharArray();
                Arrays.sort(ch);
                String string=new String(ch);
                  System.out.println(string);
                }
            }
        }
    }
