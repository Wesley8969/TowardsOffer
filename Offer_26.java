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
    public boolean isSubStructure(TreeNode A, TreeNode B) {
        if(A==null || B==null)
            return false;
        if(A.val==B.val && subtree(A,B))
            return true;
        return isSubStructure(A.left,B) || isSubStructure(A.right,B);
    }
    private boolean subtree(TreeNode m,TreeNode n){
        if(n==null)
            return true;
        if(m==null || m.val!=n.val)
            return false;
        return subtree(m.left,n.left) && subtree(m.right,n.right);
    }
}
//递归：先找根节点相等的，再去subtree判断树是否相等