class Solution {
    public int maxArea(int[] nums) {
        int l=0,r=nums.length-1;
        int  max=Integer.MIN_VALUE;

       while(l<r){
         int ans=Math.min(nums[l],nums[r])*(r-l);
        max=Math.max(ans,max);

        if(nums[l]<nums[r])l++;
        else r--;
       }

        return max;
    }
}