/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public boolean isSymmetric(TreeNode root) {
        if(root==null)
            return true;
        return Sym(root.left,root.right);
    }
    private boolean Sym(TreeNode m,TreeNode n){
        if(m==null && n==null)
            return true;
        if(m==null || n==null || m.val!=n.val)
            return false;
        return Sym(m.left,n.right) && Sym(m.right,n.left);
    }
}
//递归