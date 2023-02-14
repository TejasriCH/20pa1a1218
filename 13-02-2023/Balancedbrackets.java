 public static String isBalanced(String s) {
    // Write your code here
       boolean a=true;
       Stack<Character> st=new Stack<Character>();
       for(int i=0;i<s.length();i++){
           char ch=s.charAt(i);
           if(ch=='['||ch=='{'||ch=='('){
               st.push(ch);
               continue;
           }
           if(st.isEmpty()){
               return "NO";
           }
           if(ch==')'){
               if(st.peek()=='('){
                 st.pop();
               }
                else{
                 a=false;
                 break;
                }
           }
           if(ch=='}'){
               if(st.peek()=='{'){
                  st.pop();
               }
                else{
                 a=false;
                 break;
           }
           }
           if(ch==']'){
               if(st.peek()=='['){
                  st.pop();
               }
                else{
                  a=false;
                   break; 
                } 
           }
           }
          if(!st.isEmpty()){
              return "NO";
          } 
          if(a){
              return "YES";
          }
          else{
              return "NO";
          }
       }
    }
