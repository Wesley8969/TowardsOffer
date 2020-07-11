class Solution {
    public int singleNumber(int[] nums) {
        int a = 0, b = 0;
        for(int num : nums){
            a = a ^ num & ~b;
            b = b ^ num & ~a;
        }
        return a;
    }
}
//实现三进制算法，b a，00 -> 01 -> 10 -> 00 循环 最终得到01,即ones是结果
//让三个的抵消，剩下一个不重复的数字