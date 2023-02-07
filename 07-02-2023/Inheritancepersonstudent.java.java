class Person{
    private String firstName;
    private String lastName;
    private int id;
    Person(String firstName,String lastName,int id){
        this.firstName=firstName;
        this.lastName=lastName;
        this.id=id;
    }
     public void display(){
        System.out.println("Name: "+firstName+","+lastName);
        System.out.println("ID:"+id);
    }
}
class Student extends Person{
   private int[] score=new int[100];
    Student(String firstName,String lastName,int id,int[] score){
        super(firstName,lastName,id);
        this.score=score;
    }
    public char calculate(){
        int sum=0;
        int avg;
        for(int i:score){
            sum=sum+i;
        }
        avg=sum/score.length;
        if(avg>=90 && avg<=100){
            return 'O';
        }
        else if(avg>=80 && avg<90){
            return'E';
        }
        else if(avg>=70 && avg<80){
            return 'A';
        }
        else if(avg>=55 && avg<70){
            return 'P';
        }
        else if(avg>=40 && avg<55){
            return 'D';
        }
        else{
            return 'T';
        }
    }
}
public class Solution {

    public static void main(String[] args) {
         Scanner scan= new Scanner(System.in);
        String firstName=scan.next();
        String lastName=scan.next() ;
        int id=scan.nextInt();
        int n=scan.nextInt() ;
        int[] Scores=new int[n];
        for (int i = 0; i < n; i++) {
            Scores[i] = scan.nextInt();
            }
        Student s = new Student(firstName, lastName, id, Scores);
        s.display();
        System.out.println("Grade: "+s.calculate()) ;
    }
}
