class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
        Map<String,Integer> map=new HashMap<>();
        int n=s.length();

        List<String> ans=new ArrayList<>();
        if(n<10)return ans;
        String dna=s.substring(0,10);
        map.put(dna,map.getOrDefault(dna,0)+1);
        if(map.get(dna)>1&&!ans.contains(dna))
                ans.add(dna);
        for(int i=10;i<n;i++){
            dna=dna.substring(1)+s.charAt(i);
             map.put(dna,map.getOrDefault(dna,0)+1);
            
            if(map.get(dna)>1 &&!ans.contains(dna))
                ans.add(dna);

            
        }
        return ans;
        
    }
}