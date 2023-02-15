class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode a=null;
        while(head!=null){
            ListNode next=head.next;
            head.next=a;
            a=head;
            head=next;
        }
        return a;
    }
}
