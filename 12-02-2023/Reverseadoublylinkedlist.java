class Result {
    public static DoublyLinkedListNode reverse(DoublyLinkedListNode llist) {
       DoublyLinkedListNode temp=llist.next;
        llist.next=llist.prev;
        llist.prev=temp;
        if(temp==null)
            return llist;
       return(reverse(temp));
    }

}
