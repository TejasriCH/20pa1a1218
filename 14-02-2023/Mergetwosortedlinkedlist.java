 static SinglyLinkedListNode mergeLists(SinglyLinkedListNode head1, SinglyLinkedListNode head2) {
      if(head1==null) return head2;
      if(head2==null) return head1;
        if(head1.data>head2.data){
            SinglyLinkedListNode temp=head1;
            head1=head2;
            head2=temp;
        }
        SinglyLinkedListNode result=head1;
        while(head1!=null && head2!=null){
            SinglyLinkedListNode t=null;
            while(head1!=null && head1.data<=head2.data){
                t=head1;
                head1=head1.next;
            }
            t.next=head2;
           SinglyLinkedListNode temp=head1;
            head1=head2;
            head2=temp;
        }
        return result;

    }
