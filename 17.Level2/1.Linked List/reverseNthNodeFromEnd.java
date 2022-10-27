/// 19. Remove Nth Node From End of List
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode fast = head , slow = head;
        int gap = n-1;
        while(gap!=0){
            fast = fast.next;
            gap--;
        }
        if(fast.next == null) return head.next;
        ListNode prev = null;
        while(fast.next!=null){
            fast = fast.next;
            prev = slow;
            slow = slow.next;
        }
        // if()
        prev.next = slow.next;
        return head;
    }
}