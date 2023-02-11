public static SinglyLinkedListNode insertNodeAtPosition(SinglyLinkedListNode llist, int data, int position) {
      SinglyLinkedListNode cur=new SinglyLinkedListNode(data);
       if(position==0){
           cur.next=llist;
           llist=cur;
           return llist;
       }
       SinglyLinkedListNode a=llist;
       for(int i=1;i<position;i++)
           a=a.next;
           cur.next=a.next;
           a.next=cur;
        return llist;
       
    }
    }

