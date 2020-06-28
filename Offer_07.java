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
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        if(preorder.length==0 || inorder.length==0)
            return null;
        int i=0;
        for(;inorder[i]!=preorder[0];i++);
        TreeNode root=new TreeNode(preorder[0]);
        root.left=buildTree(Arrays.copyOfRange(preorder,1,1+i),Arrays.copyOfRange(inorder,0,i));
        root.right=buildTree(Arrays.copyOfRange(preorder,1+i,preorder.length),Arrays.copyOfRange(inorder,i+1,inorder.length));
        return root;
    }
}
//递归建树，注意：用Arrays.copyOfRange来取子数组