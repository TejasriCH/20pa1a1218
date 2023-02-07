class Result {
    public static void countApplesAndOranges(int s, int t, int a, int b, List<Integer> apples, List<Integer> oranges) {
        long count1=0;
        long count2=0;
       for(int i=0;i<apples.size();i++){
          int x=a+apples.get(i);
           if(x>=s && x<=t){
               count1+=1;
           }
       }
       for(int j=0;j<oranges.size();j++){
           int y=b+oranges.get(j);
           if(y<=t && y>=s){
               count2+=1;
           }
       }
        System.out.println(count1);
        System.out.println(count2);
    }

}
