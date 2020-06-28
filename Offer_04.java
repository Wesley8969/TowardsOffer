class Solution {
    public boolean findNumberIn2DArray(int[][] matrix, int target) {
        if(matrix==null || matrix.length==0 || matrix[0].length==0)
            return false;
        int i=0,j=matrix[0].length-1;
        while(i<matrix.length && j>=0){
            int tmp=matrix[i][j];
            if(target==tmp)
                return true;
            else if(target<tmp)
                j--;
            else
                i++;
        }
        return false;      
    }
}
// 1.可以暴力解决，时间复杂度大
// 2.可以在每一行都二分查找，优化：在列上某列第一个数若大于目标值就结束循环
// 3.上述代码方法，从右上角来看，是一个二叉搜索树结构。