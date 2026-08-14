class Solution {
    public int maximumLengthSubstring(String s) {
        
        int n=s.length();
        int l=0,max=0;
        Map<Character,Integer> map=new HashMap<>();

        for(int r=0;r<n;r++){
            char ch=s.charAt(r);
            map.put(ch,map.getOrDefault(ch,0)+1);

            while(map.get(ch)>2){
                map.put(s.charAt(l),map.get(s.charAt(l))-1);
                if(map.get(s.charAt(l))==0)map.remove(s.charAt(l));
                l++;
            }
            max=Math.max(max,r-l+1);
        }
        return max;
    }
}