class Solution {
    public int maxSubArray(int[] nums) {

        // int sum = 0;
        // int max = Integer.MIN_VALUE;
        // for (int num : nums) {
        //     if(sum<=0) 
        //         sum=num;
        //     else 
        //         sum+=num;            
        //     max = Math.max(max, sum);
        // }
        // return max;  
        //如果之前和是负数，那么这个点上的最大值就是自己的值，如果是整数，这个点上的最大值就是加上前面的值
        //本质还是计算每个点的最大值

        int[] dp=new int[nums.length];
        int max=nums[0];
        dp[0]=nums[0];
        for(int i=1;i<nums.length;i++){
            dp[i]=(dp[i-1]+nums[i])>nums[i]?(dp[i-1]+nums[i]):nums[i];
            max=max>dp[i]?max:dp[i];
        }
        return max;
    }
}
//求最大的子数组和，O(n):
//动态规划
