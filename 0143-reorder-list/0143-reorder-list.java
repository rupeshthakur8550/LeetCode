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
    private ListNode getMid(ListNode head){
        ListNode slow = null, fast = head, prev;
        while(fast != null && fast.next != null){
            slow = (slow == null) ? head : slow.next;
            fast = fast.next.next;
        }
        System.gc();
        return slow.next;
    }
    
    private ListNode reverse(ListNode node){
        ListNode prev = null, curr = node, next = null;
        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        System.gc();
        return prev;
    }

    public void reorderList(ListNode head) {
        if(head == null || head.next == null)
            return ;
        ListNode mid = getMid(head);
        ListNode SH = reverse(mid);
        ListNode FH = head;
        while (FH != null && SH != null) {
            ListNode temp = FH.next;
            FH.next = SH;
            FH = temp;
            temp = SH.next;
            SH.next = FH;
            SH = temp;
        }
        if (FH != null)
            FH.next = null;
    }
}