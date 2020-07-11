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
    public int maxDepth(TreeNode root) {
        if(root==null)
            return 0;
        return 1+(int)Math.max(maxDepth(root.left),maxDepth(root.right));
    }
}
//dfs深度优先递归求二叉树深度