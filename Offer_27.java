/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

// class Solution {
//     public TreeNode mirrorTree(TreeNode root) {
//         if(root==null)
//             return root;
//         TreeNode tmp=root.left;
//         root.left=mirrorTree(root.right);
//         root.right=mirrorTree(tmp);
//         return root;
//     }
// }
// //递归

class Solution{
    public TreeNode mirrorTree(TreeNode root){
        if(root==null)
            return root;
        Stack<TreeNode> s=new Stack<>();
        s.push(root);
        while(!s.empty()){
            TreeNode m=s.pop();
            TreeNode n=m.left;
            m.left=m.right;
            m.right=n;
            if(m.right!=null)
                s.push(m.right);
            if(m.left!=null)
                s.push(m.left);
        }
        return root;
    }
}
//用栈，非递归