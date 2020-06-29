class Solution {
    public int numWays(int n) {
        if(n==0)
            return 1;
        if(n<=2)
            return n;
        int x=1,y=2;
        for(int i=3;i<=n;i++){
            int tmp=(x+y)%1000000007;
            x=y;
            y=tmp;
        }
        return y;
    }
}
//青蛙跳台阶，实际也就是dp，dp[1]=1,dp[2]=2,dp[n]=dp[n-1]+dp[n-2];注意：默认dp[0]=1