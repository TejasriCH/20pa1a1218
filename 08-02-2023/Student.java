import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
class Student{
  private String name;
  private int rollNo;
  private String branch;
  private int year;
  private List<Integer> marks;
  private static int noOfStuds;
    public Student(String name,int rollNo,String branch,int year){
        this.name=name;
        this.rollNo=rollNo;
        this.branch=branch;
        this.year=year;
        marks=new ArrayList<Integer>();
        noOfStuds++;
    }
    public String getName(){
        return name;
    }
    public int getRollNo(){
        return rollNo;
    }
    public String getBranch(){
        return branch;
    }
    public int getYear(){
        return year;
    }
      public List<Integer> getmarks(){
        return marks;
    }
    public static void displayNoStuds() {
        System.out.println("NoOfStudents="+noOfStuds);
    }
    public void display(){
        System.out.println(rollNo+" "+name+" "+branch+" "+year);
    }
    public double computePercentage(){
        double sum=0;
        for(Integer mark:marks){
            sum=sum+mark;
        }
        if(marks.size()==0){
            return 0;
        }
        return sum/marks.size();
    }
    public void setMarks(int obtmarks){
        marks.add(obtmarks);
    }
}

public class Solution {

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        List<Student> students = new ArrayList<>();
        for(int i=0;i<n;i++){
            String[] line = sc.nextLine().split(" ");
            Student s = new Student(line[0],Integer.parseInt(line[1]),line[2],Integer.parseInt(line[3]));
            students.add(s);
            String[] nums=sc.nextLine().split(" ");
            for(int j=0;j<nums.length;j++){
                students.get(i).setMarks(Integer.parseInt(nums[j]));
            }
        }
        for(int i=0;i<n;i++){
            students.get(i).display();
            System.out.print(students.get(i).getRollNo()+" ");
            System.out.printf("%.2f",students.get(i).computePercentage());
            System.out.println();
        }
        Student.displayNoStuds();
    }
}
