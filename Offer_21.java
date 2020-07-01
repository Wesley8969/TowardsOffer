class Solution {
    public int[] exchange(int[] nums) {
        int i=0,j=nums.length-1;
        while(i<j){
            while(i<nums.length && nums[i]%2==1 )i++;
            while(j>0 && nums[j]%2==0)j--;
            if(i<j){
                int tmp=nums[i];
                nums[i]=nums[j];
                nums[j]=tmp;
            }
            i+=1;
            j-=1;
        }
        return nums;
    }
}
//双指针，时间O(n),空间O(1)