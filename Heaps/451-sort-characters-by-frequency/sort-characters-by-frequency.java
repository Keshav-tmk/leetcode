class Solution {
    public String frequencySort(String s) {

        Map<Character,Integer> map=new HashMap<>();

        for(char ch : s.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }

        PriorityQueue<Map.Entry<Character,Integer>>pq=new PriorityQueue<>((a,b)->b.getValue()-a.getValue());

        for(Map.Entry<Character,Integer> e: map.entrySet()){
            pq.offer(e);
        }

        StringBuilder sb=new StringBuilder();
        while(pq.size()>0){
            char c=pq.poll().getKey();
            while(map.containsKey(c)){
                sb.append(c);
                map.put(c,map.get(c)-1);
                if(map.get(c)==0)map.remove(c);
                
            }
        }

        return sb.toString();
    }
}