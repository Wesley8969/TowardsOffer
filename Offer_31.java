class Solution {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        if(pushed.length==0 || pushed.length==1)
            return true;
        int i=0,j=0;
        Stack<Integer> s=new Stack<>();
        while(true){
            if(j>=popped.length)
                return true;         
            if(s.empty() || popped[j]!=s.peek()){
                if(i>=pushed.length)
                    return false;
                while(i<pushed.length && pushed[i]!=popped[j])
                    s.push(pushed[i++]);
                i++;
            }
            else
                s.pop();
            j++;            
        }
    }
}
//以poped数组为中心，看每个值是否要么栈中最后一个值:
//  是，就i不变，栈pop；
//  不是，向后遍历pushed数组，同时放入栈直到和j相等。

//法2：简洁
// class Solution{
//    public boolean validateStackSequences(int[] pushed, int[] popped) {
//         Stack<Integer> stack = new Stack();
//         int j = 0;
//         for (int elem : pushed) {
//             stack.push(elem);
//             while (j < popped.length && !stack.isEmpty() && stack.peek() == popped[j]) {
//                 stack.pop();
//                 j++;
//             }
//         }
//         return j == popped.length;
//     }
// }