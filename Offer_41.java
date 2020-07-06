class MedianFinder {
    Queue<Integer> q1;
    Queue<Integer> q2;
    /** initialize your data structure here. */
    public MedianFinder() {
        q1=new PriorityQueue<>((v1,v2)->v2-v1);
        q2=new PriorityQueue<>();
    }
    
    public void addNum(int num) {
        if(q1.size()==0){
            q1.offer(num);
            return ;
        }
        if(q2.size()==0 || num<=q2.peek())
            q1.offer(num);
        else{
            q2.offer(num);
            q1.offer(q2.poll());
        }
        if(q1.size()>q2.size()+1)
            q2.offer(q1.poll());          
    }
    
    public double findMedian() {
        int count=q1.size()+q2.size();
        if(count%2==1)
            return q1.peek();
        else    
            return 0.5*(q1.peek()+q2.peek());
    }
}

/**
 * Your MedianFinder object will be instantiated and called as such:
 * MedianFinder obj = new MedianFinder();
 * obj.addNum(num);
 * double param_2 = obj.findMedian();
 */

 //方法1：list，每次查找中位数都排序并输出中位数，时间复杂度高；
 //方法2：大根堆和小根堆，保证两个堆的大小相近并且小根堆最小值大于大根堆最大值（顺序性）；