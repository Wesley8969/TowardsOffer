class CQueue {
    Stack<Integer> s1;
    Stack<Integer> s2;
    public CQueue() {
        s1=new Stack<>();
        s2=new Stack<>();
    }
    
    public void appendTail(int value) {
        s1.push(value);
    }
    
    public int deleteHead() {
        if(s2.size()==0 && s1.size()==0)
            return -1;
        if(s2.size()!=0)
            return s2.pop();
        while(s1.size()>0){
            int tmp=s1.pop();
            s2.push(tmp);
        }
        return s2.pop();
    }
}
// 栈的用法

/**
 * Your CQueue object will be instantiated and called as such:
 * CQueue obj = new CQueue();
 * obj.appendTail(value);
 * int param_2 = obj.deleteHead();
 */