class Solution {
    class pair{
        int val;
        int i;
        int j;
        pair(int val,int i,int j){
            this.val=val;
            this.i=i;
            this.j=j;
        }
    }
    public int[] smallestRange(List<List<Integer>> nums) {
        PriorityQueue<pair> pq=new PriorityQueue<>((a,b)->a.val-b.val);
        int max=Integer.MIN_VALUE;
        for(int i=0;i<nums.size();i++){
            int val=nums.get(i).get(0);
            pq.offer(new pair(val,i,0));

            max=Math.max(max,val);
            
        }
        int st=0;
        int end=Integer.MAX_VALUE;

        while(true){
            pair curr=pq.poll();
            int min=curr.val;

            if(max-min<end-st){
                st=min;
                end=max;
            }

            if(curr.j+1==nums.get(curr.i).size())break;
            int val=nums.get(curr.i).get(curr.j+1);
            pq.offer(new pair(val,curr.i,curr.j+1));
            max=Math.max(max,val);


        }
        return new int[]{st,end};


        
    }
}