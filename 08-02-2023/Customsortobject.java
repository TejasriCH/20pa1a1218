class Candidate implements Comparable<Candidate>{
    private String name;
    private int marks;
   Candidate(String name,int marks){
    this.name=name;
    this.marks=marks;
   }
  public String getName(){
      return name;
  }
  public int getMark(){
      return marks;
  }
  public int compareTo(Candidate e){
     return marks-e.marks; 
  }
}
