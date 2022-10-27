/// 25. Reverse Nodes in k-Group
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
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode dummy = new ListNode(-1);
        ListNode p1 = dummy;
        int size = size(head);
        int work = size/k;  // this would give number of groups 
        ListNode prev = head , curr = head;
        while(work!=0){
            int temp = k - 1;
            while(temp != 0){
                curr = curr.next;
                temp--;
            }
            ListNode nbr = curr.next;
            curr.next = null;
            reverse(prev);
            p1.next = curr;
            p1 = prev;
            
            curr = prev = nbr;
            work--;
        }
        
        p1.next = curr;
        return dummy.next;
        
    }
    public static void reverse(ListNode head){
        ListNode prev = null;
        // ListNode curr = head;
        while(head!=null){
            ListNode next = head.next;
            head.next = prev;
            prev = head;
            head = next;
        }
    }
    
    public static int size(ListNode head){
        int size = 0;
        ListNode ll = head;
        while(ll != null){
            size++;
            ll = ll.next;
        }
        return size;
    }
}