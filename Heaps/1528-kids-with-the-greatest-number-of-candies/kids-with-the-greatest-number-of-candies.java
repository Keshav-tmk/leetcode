class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int k) {
         int max=Integer.MIN_VALUE;
        for(int i:candies){
            max=Math.max(i,max);
        }
        List<Boolean> res=new ArrayList<>();

        for(int i=0;i<candies.length;i++){
            if(candies[i]+k>=max)res.add(true);
            else res.add(false);
        }
        return res;
        
    }
}