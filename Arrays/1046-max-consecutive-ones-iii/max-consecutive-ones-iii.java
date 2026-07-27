class Solution {
    public int longestOnes(int[] nums, int k) {

        int n=nums.length;
        int l=0,max=Integer.MIN_VALUE;
        int cnt0=0;

        for(int r=0;r<n;r++){

            if(nums[r]==0)cnt0++;

            while(cnt0>k){
                if(nums[l++]==0)cnt0--;
            }

            max=Math.max(max,r-l+1);


        }
        return max;
        
    }
}