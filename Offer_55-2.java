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
    public boolean isBalanced(TreeNode root) {
        if(root==null)
            return true;
        int l=getDepth(root.left);
        int r=getDepth(root.right);
        if(l>r+1 || r>l+1)
            return false;
        return isBalanced(root.left) && isBalanced(root.right);
    }
    private int getDepth(TreeNode m){
        if(m==null)
            return 0;
        return 1+(int)Math.max(getDepth(m.left),getDepth(m.right));
    }
}
//递归判断平衡二叉树