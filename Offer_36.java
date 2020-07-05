/*
// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val,Node _left,Node _right) {
        val = _val;
        left = _left;
        right = _right;
    }
};
*/
class Solution {
    Node pre=new Node(-1);
    public Node treeToDoublyList(Node root) {
        if(root==null)
            return root;
        Node tmp=pre;
        InOrder(root);
        pre.right=tmp.right;
        tmp.right.left=pre;
        return tmp.right;
    }
    private void InOrder(Node root){
        if(root.left!=null)
            InOrder(root.left);
        pre.right=root;
        root.left=pre;
        pre=root;
        if(root.right!=null)
            InOrder(root.right);
    }
}
//中序遍历，以虚拟节点pre为头创造双端队列，再处理头和尾即可。二叉树转化为双端队列。