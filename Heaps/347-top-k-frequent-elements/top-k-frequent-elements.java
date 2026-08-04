class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        
        Map<Integer,Integer> map=new HashMap<>();

        for(int i:nums){
            map.put(i,map.getOrDefault(i,0)+1);
        }

        PriorityQueue<Map.Entry<Integer,Integer>> pq=new PriorityQueue<>((a,b)->a.getValue()-b.getValue());

        for(Map.Entry<Integer,Integer> e:map.entrySet()){
            pq.offer(e);

            if(pq.size()>k)pq.poll();
        }
        int [] arr=new int [k];

        for(int i=k-1;i>=0;i--){
            arr[i]=pq.poll().getKey();
        }
    return arr;
    }
}