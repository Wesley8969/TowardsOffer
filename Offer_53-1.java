class Solution {
    public int search(int[] nums, int target) {
        int l=0,r=nums.length-1,mid=0,len=1;
        while(l<=r){
            mid=(l+r)/2;
            if(nums[mid]<target)
                l=mid+1;
            else if(nums[mid]>target)
                r=mid-1;
            else
                break;
        }
        if(r<0 || nums[mid]!=target)
            return 0;
        for(int i=mid-1;i>=0 && nums[i]==target;i--,len++);
        for(int i=mid+1;i<nums.length && nums[i]==target;i++,len++);
        return len;
    }
}
//有序数组的二分查找法,考虑边界：数组为空的情况