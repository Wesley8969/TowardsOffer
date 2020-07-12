class MaxQueue {

    Deque<Integer> q;
    Deque<Integer> d;

    public MaxQueue() {
        q=new LinkedList<>();
        d=new LinkedList<>();
    }
    
    public int max_value() {
        if(!d.isEmpty())
            return d.peekFirst();
        return -1;
    }
    
    public void push_back(int value) {
        q.offerLast(value);
        while(!d.isEmpty() && d.peekLast()<value)
            d.pollLast();
        d.offerLast(value);
    }
    
    public int pop_front() {
        if(q.isEmpty())
            return -1;
        int tmp=q.pollFirst();
        if(tmp==d.peekFirst())
            d.pollFirst();
        return tmp;
    }
}
//一个普通队列+一个双端队列实现的单调队列
//尽量用双端队列！！！

/**
 * Your MaxQueue object will be instantiated and called as such:
 * MaxQueue obj = new MaxQueue();
 * int param_1 = obj.max_value();
 * obj.push_back(value);
 * int param_3 = obj.pop_front();
 */