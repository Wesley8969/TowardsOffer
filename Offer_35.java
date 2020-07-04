/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/
// class Solution {
//     public Node copyRandomList(Node head) {
//         if(head==null)
//             return null;
//         Map<Node,Node> m=new HashMap<>();
//         for(Node tmp=head;tmp!=null;tmp=tmp.next)
//             m.put(tmp,new Node(tmp.val));
//         for(Node tmp=head;tmp!=null;tmp=tmp.next){
//             m.get(tmp).next=m.get(tmp.next);
//             m.get(tmp).random=m.get(tmp.random);
//         }
//         return m.get(head);
//     }
// }
// //字典解决链表深复制问题；比较耗费空间O(n)

class Solution {
    public Node copyRandomList(Node head) {
        if(head==null)
            return null;
        for(Node tmp=head;tmp!=null;tmp=tmp.next.next){
            Node copy=new Node(tmp.val);
            copy.next=tmp.next;
            tmp.next=copy;
        }
        for(Node tmp=head;tmp!=null;tmp=tmp.next.next)
            if(tmp.random!=null)
                tmp.next.random=tmp.random.next;
        Node copyHead=head.next;
        for(Node tmp=head;tmp!=null;tmp=tmp.next){
            Node copy=tmp.next;
            tmp.next=copy.next;
            if(copy.next!=null)
                copy.next=copy.next.next;
        }
        return copyHead;
    }
}
// 链表深复制，空间复杂度O(1)，每个结点后面插入一个新节点，设置新节点的random值，再分开