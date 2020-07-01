/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode deleteNode(ListNode head, int val) {
        if(head.val==val)
            return head.next;
        ListNode tmp=head;
        while(tmp.next.val!=val)
            tmp=tmp.next;
        tmp.next=tmp.next.next;
        return head;        
    }
}
//简单的单链表删除