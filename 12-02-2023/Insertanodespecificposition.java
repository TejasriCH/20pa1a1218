class Result {
    public static SinglyLinkedListNode insertNodeAtPosition(SinglyLinkedListNode llist, int data, int position) {
        SinglyLinkedListNode result=new SinglyLinkedListNode(data);
       if(position==0){
           result.next=llist;
           llist=result;
           return llist;
       }
        SinglyLinkedListNode a=llist;
        for(int i=0;i<position-1;i++)
            a=a.next;
            result.next=a.next;
            a.next=result;
        return llist;
        
        
    }

}
