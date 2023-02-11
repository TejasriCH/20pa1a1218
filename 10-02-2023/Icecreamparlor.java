public static List<Integer> icecreamParlor(int m, List<Integer> arr) {
      int n=arr.size();
      ArrayList<Integer> list=new ArrayList<Integer>();
      for(int i=0;i<n;i++){
          for(int j=i+1;j<n;j++){
              if(arr.get(i)+arr.get(j)==m){
                  list.add(i+1);
                  list.add(j+1);
              }
          }
      }
      return list;
    }

}
