class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        Map<String,Integer> map=new HashMap<>();

        for(String i:words){
            map.put(i,map.getOrDefault(i,0)+1);

        }
        PriorityQueue<Map.Entry<String,Integer>> p=new PriorityQueue<>((a,b)->{

                if (a.getValue().equals(b.getValue()))
                    return b.getKey().compareTo(a.getKey());

                return a.getValue() - b.getValue();
            });

        for(Map.Entry<String,Integer> e:map.entrySet()){
            p.offer(e);

            if(p.size()>k)p.poll();
        }
        List<String>ans=new ArrayList<>();

        while(k-->0){ans.add(p.poll().getKey());}
         Collections.reverse(ans);
         return ans;
    }
}