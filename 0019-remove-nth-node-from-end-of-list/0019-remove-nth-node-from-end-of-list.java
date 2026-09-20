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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode fastPointer = head, slowPointer = head;
        for(int i=0; i<n; i++){
            fastPointer = fastPointer.next;
        }

        if (fastPointer == null) {
            return head.next;
        }

        while(fastPointer.next != null){
            slowPointer = slowPointer.next;
            fastPointer = fastPointer.next;
        }

        slowPointer.next = slowPointer.next.next;

        return head;
    }
}