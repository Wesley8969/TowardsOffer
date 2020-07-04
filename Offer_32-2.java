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
        int n=1;
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
                res.add(new ArrayList<>(oneLevel));
                oneLevel.clear();
                n=q.size();
            }
        }
        return res;
    }
}
//非递归方法

//递归方法：
// class Solution {
//     List<List<Integer>> node=new ArrayList();
//     public List<List<Integer>> levelOrder(TreeNode root) {
//         lei(root,0);
//         return node;
//     }
//     public void lei(TreeNode root,int k){
//         if(root!=null){
//             if(node.size()<=k)node.add(new ArrayList());
//             node.get(k).add(root.val);
//             lei(root.left,k+1);
//             lei(root.right,k+1);
//         }
//     }
// }