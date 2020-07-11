class Solution {
    public int[] singleNumbers(int[] nums) {
        int f=0;
        for(int x:nums)
            f^=x;
        int tmp=1;
        while(f%2!=1){
            f/=2;
            tmp*=2;
        }
        int[] res={0,0};
        for(int x:nums)
            if((tmp&x)==0)
                res[0]^=x;
            else
                res[1]^=x;
        return res;
    }
}
//找两两重复数组里不重复的数字：
// 如果是一个不重复的数字：全部异或，两两抵消则剩余一个
// 如果是两个不重复的数字：全部异或，得到两个不重复数字的异或值，找到位是1的数将原数组分为两组，每组内部都按照有一个不重复的数字来计算即可

// a^a=0
// a^0=1
// 异或的交换律、结合律
// a^(-a) 得到最低位为1的二进制