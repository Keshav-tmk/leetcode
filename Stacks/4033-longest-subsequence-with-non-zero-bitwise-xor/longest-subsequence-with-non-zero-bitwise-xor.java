class Solution {
    public int longestSubsequence(int[] nums) {
            int n=nums.length;
            int a=0;
            int flag=0;
            for(int i=0;i<n;i++){
                a^=nums[i];
                if(nums[i]!=0)flag=1;
            }
            if(a!=0)return n;
            
            else if(flag==1)return n-1;

            return 0;


    }
}