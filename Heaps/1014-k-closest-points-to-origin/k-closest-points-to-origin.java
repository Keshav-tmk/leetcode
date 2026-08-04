class Solution {
    class pair{
        int dis;
        int i;
        pair(int dis,int i)
        {
            this.dis=dis;
            this.i=i;
        }
    }
    public int[][] kClosest(int[][] points, int k) {
        PriorityQueue<pair> pq=new PriorityQueue<>((a,b)-> b.dis-a.dis
        );
        
        for(int i=0;i<points.length;i++){
            int sq=(points[i][0]*points[i][0])+(points[i][1]*points[i][1]);
            pq.offer(new pair(sq,i));
            if(pq.size()>k)pq.poll();
        }

        int [][]ans=new int[k][2];
        
        int idx=0;
        while(!pq.isEmpty()){
            pair p=pq.poll();

            ans[idx][0]=points[p.i][0];
            ans[idx][1]=points[p.i][1];

            idx++;

        }
        
        return ans;


    }
}