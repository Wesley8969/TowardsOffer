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
    public int[] levelOrder(TreeNode root) {
        if(root==null)
            return new int[0];
        Deque<TreeNode> q=new LinkedList<>();
        List<Integer> l=new ArrayList<>();
        q.offerLast(root);
        while(!q.isEmpty()){
            TreeNode tmp=q.pollFirst();
            l.add(tmp.val);
            if(tmp.left!=null)
                q.offerLast(tmp.left);
            if(tmp.right!=null)
                q.offerLast(tmp.right);
        }
        int[] res=new int[l.size()];
        for(int i=0;i<l.size();i++)
            res[i]=l.get(i);
        return res;
    }
}
//队列实现二叉树的层次遍历，Deque使用