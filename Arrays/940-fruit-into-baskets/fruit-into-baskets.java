class Solution {
    public int totalFruit(int[] arr) {
        int n=arr.length;
        Map<Integer,Integer> map=new HashMap<>();

        int l=0,max=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);

            
            while(map.size()>2){
                
                map.put(arr[l],map.get(arr[l])-1);
                if(map.get(arr[l])==0)
                    map.remove(arr[l]);
                l++;
            }
            max=Math.max(max,i-l+1);


        }
        return max;
    }
}