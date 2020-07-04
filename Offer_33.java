class Solution {
    public boolean verifyPostorder(int[] postorder) {
        if(postorder.length==0)
            return true;
        return verify(postorder,0,postorder.length-1);
    }
    private boolean verify(int[] postorder,int i,int j){
        if(i>=j)
            return true;
        int mid=postorder[j];
        int x=i;
        while(x<j && postorder[x]<mid)x++;
        for(int tmp=x;tmp<j;tmp++)
            if(postorder[tmp]<mid)
                return false;
        return verify(postorder,i,x-1) && verify(postorder,x,j-1);
    }
}
//递归：最后一个值是根节点，不断切分数组分为大于和小于根节点值的左右两个子树，
//      再递归判断子树是否为二叉搜索树后续遍历结果。