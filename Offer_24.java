/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode pre=null;
        while(head!=null){
            ListNode tmp=head;
            head=head.next;
            tmp.next=pre;
            pre=tmp;
        }
        return pre;
    }
}
//1.头插法链表操作，耗费空间
//2.原地反转