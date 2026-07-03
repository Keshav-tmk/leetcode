class Solution {

    public void help(List<List<Integer>> ans, ArrayList<Integer>curr,int[]nums){
        if(curr.size()==nums.length){
            ans.add(new ArrayList<>(curr));
            return;
        }

        for(int num : nums){
            if(curr.contains(num))continue;

            curr.add(num);
            help(ans,curr,nums);
            curr.remove(curr.size()-1);

        }   
         }

    public List<List<Integer>> permute(int[] nums) {
        
        List<List<Integer>>ans=new ArrayList<>();
        help(ans,new ArrayList<Integer>(),nums);
        return ans;

        
        
    }
}