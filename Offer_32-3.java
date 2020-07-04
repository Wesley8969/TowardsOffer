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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res=new ArrayList<>();
        if(root==null)
            return res;
        Deque<TreeNode> q=new LinkedList<>();
        q.offerLast(root);
        int n=1,x=0;
        List<Integer> oneLevel=new ArrayList<>();
        while(!q.isEmpty()){
            TreeNode tmp=q.pollFirst();
            oneLevel.add(tmp.val);
            if(tmp.left!=null)
                q.offerLast(tmp.left);
            if(tmp.right!=null)
                q.offerLast(tmp.right);
            n--;
            if(n==0){
                if(x==0){
                    res.add(new ArrayList<>(oneLevel));
                    x++;
                }
                else{
                    Collections.reverse(oneLevel);
                    res.add(new ArrayList<>(oneLevel));
                    x--;
                }
                n=q.size();
                oneLevel.clear();
            }
        }
        return res;
    }
}
//层次遍历+计算每层的数量+后处理每层的顺序