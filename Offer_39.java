class Solution {
    public int majorityElement(int[] nums) {

        //排序后计数
        // Arrays.sort(nums);
        // for(int i=0;i<nums.length;){
        //     int tmp=nums[i];
        //     int num=0;
        //     while(i<nums.length && nums[i]==tmp){
        //         num++;
        //         i++;
        //         if(num>nums.length/2)
        //             return tmp;
        //     }
        // }
        // return 0;

        //如果超过半数，排序后答案必定在中间
        // Arrays.sort(nums);
        // return nums[nums.length/2];

        //摩尔计数法，极限一换一，记录数组中数量大于数组一半的数
        int count=0,res=0;
        for(int tmp:nums){
            if(count==0)
                res=tmp;
            count+=(res==tmp)?1:-1;
        }
        return res;
    }
}
