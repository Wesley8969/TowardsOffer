// /**
//  * Definition for a binary tree node.
//  * public class TreeNode {
//  *     int val;
//  *     TreeNode left;
//  *     TreeNode right;
//  *     TreeNode(int x) { val = x; }
//  * }
//  */
// class Solution {
//     public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
//         Deque<TreeNode> q1=getNode(root,p);
//         Deque<TreeNode> q2=getNode(root,q);
//         while(q1.size()>q2.size())q1.pollLast();
//         while(q1.size()<q2.size())q2.pollLast();
//         while(q1.peekLast()!=q2.peekLast()){
//             q1.pollLast();
//             q2.pollLast();
//         }
//         return q1.peekLast();
//     }
//     private Deque<TreeNode> getNode(TreeNode m,TreeNode n){
//         Deque<TreeNode> q=new LinkedList<>();
//         Set<TreeNode> s=new HashSet<>();
//         q.offerLast(m);
//         while(!q.isEmpty()){
//             TreeNode tmp=q.peekLast();
//             while(tmp.left!=null && !s.contains(tmp.left)){
//                 q.offerLast(tmp.left);
//                 tmp=tmp.left;
//             }
//             s.add(tmp);
//             if(tmp.val==n.val)
//                 break;
//             if(tmp.right!=null && !s.contains(tmp.right))
//                 q.offerLast(tmp.right);
//             else
//                 q.pollLast();
//         }
//         return q;
//     }
// }
// //二叉树的中序遍历，非递归方法,得到两者的搜索路径存放在栈里


//法2：left/right表示在左右子树里能否找到p或者q，递归
class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null || root == p || root == q) 
            return root;
        TreeNode left = lowestCommonAncestor(root.left, p, q);
        TreeNode right = lowestCommonAncestor(root.right, p, q);
        if (left== null) 
            return right;
        if (right== null) 
            return left;
        return root;
    }
}