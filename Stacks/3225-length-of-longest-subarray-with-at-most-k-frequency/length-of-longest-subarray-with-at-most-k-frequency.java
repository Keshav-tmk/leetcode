class Solution {
    public int maxSubarrayLength(int[] nums, int k) {
        int n=nums.length;
        int l=0;
        int max=0;
        Map<Integer,Integer> map=new HashMap<>();
       



        for(int i=0;i<n;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
            while(map.get(nums[i])>k){
                map.put(nums[l],map.get(nums[l])-1);

                if(map.get(nums[l])==0)map.remove(nums[l]);
                l++;
            }
            max=Math.max(max,i-l+1);
            
            
        }
        return max;
        
    }
}