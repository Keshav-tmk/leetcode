class Solution {
   
    public void help(List<List<Integer>> ans, ArrayList<Integer>curr,int[]nums,boolean [] used){
        if(curr.size()==nums.length && !ans.contains(curr)){
            ans.add(new ArrayList<>(curr));
            return;
        }

        for(int i=0;i<nums.length;i++){
            if(used[i])continue;
            
            used[i]=true;
            curr.add(nums[i]);
            help(ans,curr,nums,used);
            used[i]=false;
            curr.remove(curr.size()-1);

        }   
         }

    

    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>>ans=new ArrayList<>();
        Arrays.sort(nums);
        boolean[] used=new boolean[nums.length];
        help(ans,new ArrayList<Integer>(),nums,used);
        return ans;
        
    }
}