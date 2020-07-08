class Solution {
    public int missingNumber(int[] nums) {
        int l=0,r=nums.length-1;
        if(nums[r]==r)
            return r+1;
        while(l<r){
            int mid=(l+r)/2;
            if(nums[mid]>mid)
                r=mid;
            else
                l=mid+1;
        }
        return l;
    }
}
//审题: 长度为len的有序递增数组，找出里面0~len缺少的数值
//      如果数组最后一位等于下标，那就说明缺了最大值，否则就是缺了里面的值。
//有序数组二分法查找变形