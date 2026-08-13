public class Solution {
    public ListNode detectCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                // detecting the cycle
                ListNode start = head;
                // creating new pointer
                //moving the pointers at a time
                while (start != slow) {
                    start = start.next;
                    slow = slow.next;
                }
                return start;
            }

            //
        }
        return null;
    }
}