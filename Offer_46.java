class Solution {
    public int translateNum(int num) {
        String s=Integer.toString(num);
        int[] dp=new int[s.length()];
        dp[0]=1;
        for(int i=1;i<s.length();i++){
            int tmp=10*(s.charAt(i-1)-'0')+(s.charAt(i)-'0');
            if(s.charAt(i-1)!='0' && tmp<26 )
                if(i>1)
                    dp[i]+=dp[i-2];
                else
                    dp[i]+=1;
            dp[i]+=dp[i-1];
        }
        return dp[s.length()-1];
    }
}
//动态规划计算