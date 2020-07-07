class Solution {
    //递归方法，超时
    // public int maxValue(int[][] grid) {
    //     return getMaxValue(0,0,grid);
    // }
    // private int getMaxValue(int i,int j,int[][] grid){
    //     if(i>=grid.length || j>=grid[0].length)
    //         return 0;
    //     if(i==grid.length && j==grid[0].length)
    //         return grid[i][j];
    //     if(getMaxValue(i+1,j,grid)>getMaxValue(i,j+1,grid))
    //         return grid[i][j]+getMaxValue(i+1,j,grid);
    //     return grid[i][j]+getMaxValue(i,j+1,grid);
    // }

    public int maxValue(int[][] grid){
        int m=grid.length,n=grid[0].length;
        int[][] dp=new int[m][n];
        dp[0][0]=grid[0][0];
        for(int i=1;i<n;i++)
            dp[0][i]=dp[0][i-1]+grid[0][i];
        for(int i=1;i<m;i++)
            dp[i][0]=dp[i-1][0]+grid[i][0];
        for(int i=1;i<m;i++)
            for(int j=1;j<n;j++){
                dp[i][j]=grid[i][j];
                if(dp[i-1][j]>dp[i][j-1])
                    dp[i][j]+=dp[i-1][j];
                else
                    dp[i][j]+=dp[i][j-1];
                
            }
        return dp[m-1][n-1];
    }
}
//动态规划