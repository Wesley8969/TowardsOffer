class Solution {
    public int[] getLeastNumbers(int[] arr, int k) {
        //方法1：找k遍最小值(类似冒泡排序)
        // int[] res=new int[k];
        // int i=0;
        // while(i<k){
        //     int min=Integer.MAX_VALUE;
        //     int index=0;
        //     for(int j=0;j<arr.length;j++)
        //         if(arr[j]<min){
        //             min=arr[j];
        //             index=j;
        //         }
        //     res[i++]=min;
        //     arr[index]=Integer.MAX_VALUE;
        // }
        // return res;

        //方法2：应用自带库的排序函数
        // Arrays.sort(arr);
        // return Arrays.copyOfRange(arr,0,k);

        //方法3：维护大小为k的大根堆，优先队列使用
        if(k==0)
            return new int[0];
        Queue<Integer> q=new PriorityQueue<>((v1,v2)->v2-v1);
        for(int i=0;i<k;i++)
            q.offer(arr[i]);
        for(int i=k;i<arr.length;i++)
            if(q.peek()>arr[i]){
                q.poll();
                q.offer(arr[i]);
            }
        int[] res=new int[k];
        for(int i=0;i<k;i++)
            res[i]=q.poll();
        return res;        
    }
}