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
    List<List<Integer>> res;
    List<Integer> road;
    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        res=new ArrayList<>();
        road=new ArrayList<>();
        if(root==null)
            return res;
        pre(root,sum);
        return res;
    }
    private void pre(TreeNode root,int sum){
        road.add(root.val);
        if(root.left==null && root.right==null && root.val==sum)
                res.add(new ArrayList<>(road));
        if(root.left!=null)
            pre(root.left,sum-root.val);
        if(root.right!=null)
            pre(root.right,sum-root.val);
        road.remove(road.size()-1);
    }
}
//回宿算法 (行动、特定操作、撤销行动),前序遍历