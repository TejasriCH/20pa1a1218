import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
       Scanner scan=new Scanner(System.in);
        int n=Integer.parseInt(scan.nextLine());
        HashMap<String,String> map=new HashMap<String,String>();
        for(int i=0;i<n;i++){
            String name=scan.nextLine();
            String num=scan.nextLine();
            map.put(name,num);
        }
        while(scan.hasNextLine()){
            String q=scan.nextLine();
            if(map.containsKey(q)){
                System.out.println(q+"="+map.get(q));
            }
            else{
                System.out.println("Not found");
            }
        }
    }
}
