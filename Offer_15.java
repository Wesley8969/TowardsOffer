public class Solution {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        int res=0;
        while(n!=0){
            res+=n&1;
            n>>>=1;
        }
        return res;
    }
}
/// >>>，无符号右移

// 方法2：
// public class Solution {
//     // you need to treat n as an unsigned value
//     public int hammingWeight(int n) {
//         int res=0;
//         while(n!=0){
//             res++;
//             n&=n-1;
//         }
//         return res;
//     }
// }
//一个整数的二进制数中，有多少个1就可以进行多少次n&(n-1)操作