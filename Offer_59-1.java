// class Solution {
//     public int[] maxSlidingWindow(int[] nums, int k) {
//         if(nums.length==0)
//             return nums;
//         int[] res=new int[nums.length-k+1];
//         for(int i=0;i<nums.length-k+1;i++){
//             int max=nums[i];
//             for(int j=i;j<i+k;j++)
//                 if(nums[j]>max)
//                     max=nums[j];
//             res[i]=max;
//         }
//         return res;
//     }
// }
//时间复杂度O(n*k),暴力

//方法2：维护单调队列类型题
class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        if(nums.length==0 || k==0)
            return new int[0];
        Deque<Integer> q=new LinkedList<>();
        int[] res=new int[nums.length-k+1];
        for(int i=0,j=0;i<nums.length;i++){
            if(!q.isEmpty() && i-q.peekFirst()>=k)
                q.pollFirst();
            while(!q.isEmpty() && nums[i]>nums[q.peekLast()])
                q.pollLast();
            q.offerLast(i);
            if(i>k-2)
                res[j++]=nums[q.peekFirst()];
        }
        return res;
    }
}