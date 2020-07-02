/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode getKthFromEnd(ListNode head, int k) {
        ListNode tmp=head;
        while(k-->0)
            tmp=tmp.next;
        while(tmp!=null){
            head=head.next;
            tmp=tmp.next;
        }
        return head;        
    }
}
//双指针链表