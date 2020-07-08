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
    public int kthLargest(TreeNode root, int k) {
        Deque<TreeNode> q=new LinkedList<>();
        q.offerLast(root);
        while(!q.isEmpty()){
            TreeNode tmp=q.peekLast();
            if(tmp.right!=null){
                q.offerLast(tmp.right);
                tmp.right=null;
                continue;
            }
            if(k==1)
                return tmp.val;
            k--;
            q.pollLast();
            if(tmp.left!=null)
                q.offerLast(tmp.left);
        }
        return root.val;
    }
}
//搜索二叉树的逆中序遍历为从大到小的顺序