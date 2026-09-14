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
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        ListNode curr = head.next;
        ListNode prev = head;
        int pos = 1, prevPos = 0, firstPos = 0;
        int min = Integer.MAX_VALUE, max = 0;
        
        while(curr.next != null){
            if((curr.val < curr.next.val && curr.val < prev.val) ||
                (curr.val > curr.next.val && curr.val > prev.val)){
                if (prevPos != 0) {
                    min = Math.min(min, pos - prevPos);
                }else{
                    firstPos = pos;
                }
                prevPos=pos;
            }
            pos++; 
            prev = curr;
            curr = curr.next;
        }

        int[] ans = new int[2];
        if(min==Integer.MAX_VALUE && max==0){
            min=-1; max=-1;
        }else{
            max = prevPos - firstPos;
        }
        ans[0]=min;
        ans[1]=max;
        return ans;
    }
}
