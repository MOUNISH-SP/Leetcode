class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode p=null;
        ListNode c=head;
        while(c!=null){
            ListNode temp=c.next;
            c.next=p;
            p=c;
            c=temp;
        }
        return p;
        
    }
}