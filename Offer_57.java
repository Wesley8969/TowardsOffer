// class Solution {
//     public int[] twoSum(int[] nums, int target) {
//         for(int i=0;i<nums.length;i++){
//             if(nums[i]>=target)
//                 continue;
//             int tmp=target-nums[i];
//             int l=0,r=nums.length-1,mid=0;
//             while(l<=r){
//                 mid=(l+r)/2;
//                 if(nums[mid]==tmp)
//                     break;
//                 else if(nums[mid]>tmp)
//                     r=mid-1;
//                 else
//                     l=mid+1;
//             }
//             if(mid==i || l>r)
//                 continue;
//             int[] res={nums[i],nums[mid]};
//             return res;
//         }
//         return new int[0];
//     }
// }
//二分查找法

//Set方法
// public int[] twoSum(int[] nums, int target) {
    
//     Set<Integer> set = new HashSet<>();
//     for (int num : nums) {

//         if (!set.contains(target - num))
//             set.add(num);
//         else 
//             return new int[]{num, target - num};
//     }

//     return new int[]{};
// }

//双指针
class Solution{
    public int[] twoSum(int[] nums, int target) {        
        int left=0,right=nums.length-1;
        while (left < right) {
            int cur = nums[left] + nums[right];
            if (cur == target)
                return new int[]{nums[left], nums[right]};
            else if (cur > target)
                right--;
            else 
                left++;
        }
        return new int[]{};
    }
}