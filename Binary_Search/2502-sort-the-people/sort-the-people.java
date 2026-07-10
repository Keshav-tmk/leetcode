class Solution {
    public String[] sortPeople(String[] names, int[] heights) {

        Map<Integer,String> map=new HashMap<>();
        // Arrays.sort(heights);
        Integer[] h=new Integer[heights.length];
        for(int i=0;i<names.length;i++){
            h[i]=heights[i];
            map.put(h[i],names[i]);
        }
        Arrays.sort(h,(a,b)->b-a);

        for(int i=0;i<names.length;i++){
            names[i]=map.get(h[i]);
        }
return names;
        
    }
}