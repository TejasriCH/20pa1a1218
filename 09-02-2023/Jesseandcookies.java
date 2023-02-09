class Result {
    public static int cookies(int k, List<Integer> A) {
      Collections.sort(A);
        PriorityQueue<Integer> p=new PriorityQueue<Integer>();
        for(int i=0;i<A.size();i++){
            p.add(A.get(i));
        }
        int count=0;
        while(p.peek()<k && p.size()>1){
            int a=p.poll()+2*p.poll();
            p.add(a);
            count++;
        }
        if(p.peek()>=k){
           return count;
    }
        else{
            return -1;
        }

}
}
