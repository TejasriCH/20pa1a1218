class Result {
    public static String superReducedString(String s) {
      StringBuilder s1=new StringBuilder(s);
        boolean t=true;
        while(t){
           t= false;
        for(int i=0;i<s1.length()-1;i++){
            if(s1.charAt(i)==s1.charAt(i+1)){
                s1.delete(i,i+2);
                t=true;
            }
        }
        }
        if(s1.length()==0){
            return "Empty String";
        }
        else{
            return s1.toString();
        }
    }

}
