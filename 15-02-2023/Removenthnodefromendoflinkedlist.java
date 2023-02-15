class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
       ListNode begin=new ListNode();
       begin.next=head;
       ListNode f=begin;
       ListNode s=begin;
       for(int i=1;i<=n;++i)
           f=f.next;
       while(f.next!=null){
           f=f.next;
           s=s.next;
       }
       s.next=s.next.next;
       return begin.next;
    }
}
