class Solution {
    public int findRepeatNumber(int[] nums) {
        for(int i=0;i<nums.length;i++){
            int tmp=nums[i]<0?(0-nums[i]):nums[i];
            if(nums[tmp]<0)
                return tmp;
            else
                nums[tmp]*=-1;
        }
        return 0;
    }
}
// 1. 用集合Set解决
// 2. 先Arrays.sort，再线性查找
// 3. 上述代码方法,用负数做标志实现在用一个数组里（本来要设两个数组）