class Solution {
    public boolean isPalindrome(ListNode head) {
        ListNode slow=head;
        ListNode fast=head;

        while(fast!=null &&fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;

        }


        ListNode p=null;
        ListNode c=slow;
        while(c!=null){
            ListNode temp=c.next;
            c.next=p;
            p=c;
            c=temp;
        }


        ListNode first=head;
        ListNode second=p;

        while(second!=null){
            if(first.val!=second.val){
                return false;
            }

            first=first.next;
            second=second.next;

        }
        return true;

    }


}