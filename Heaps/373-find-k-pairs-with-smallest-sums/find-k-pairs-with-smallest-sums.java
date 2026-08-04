class Solution {
    class pair{
        int sum;
        int i;
        int j;
        pair(int sum,int i,int j){
            this.sum=sum;
            this.i=i;
            this.j=j;
            }
    }
    public List<List<Integer>> kSmallestPairs(int[] nums1, int[] nums2, int k) {
         
       PriorityQueue<pair> pq=new PriorityQueue<>((a,b)->a.sum-b.sum);

       for(int i=0;i<Math.min(nums1.length,k);i++){
        pq.offer(new pair(nums1[i]+nums2[0],i,0));
       }
       List<List<Integer>> ans=new ArrayList<>();
        
        while(!pq.isEmpty()&&k>0){
            
                pair curr=pq.poll();

                ans.add(Arrays.asList(nums1[curr.i],nums2[curr.j]));

                if(curr.j+1<nums2.length){
                    pq.offer(new pair(nums1[curr.i]+nums2[curr.j+1],curr.i,curr.j+1));
                }
                k--;
            
        }

        return ans;
        
    }
}