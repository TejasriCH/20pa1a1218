public static SinglyLinkedListNode reverse(SinglyLinkedListNode llist) {
    // Write your code here
      if(llist==null || llist.next==null){
          return llist;
      }
      SinglyLinkedListNode res=reverse(llist.next);
      llist.next.next=llist;
      llist.next=null;
      return res;
    }

}
        
