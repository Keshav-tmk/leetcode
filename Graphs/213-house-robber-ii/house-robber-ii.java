class Solution {
    public int rob(int[] nums) {
        int n=nums.length;
        if(n==1)return nums[0];
       int case1=help(nums,0,n-2);
       int case2=help(nums,1,n-1);

       return Math.max(case1,case2);
    }
    public int help(int [] nums,int st,int end){
         int n=nums.length;

        int[]dp=new int [n];
        dp[st]=nums[st];

        for(int i=1;i<n;i++){
            int pick=nums[i];
            if(i>1)pick+=dp[i-2];
            int np=dp[i-1];

            dp[i]=Math.max(pick,np);
        }        

        return dp[end];
    }
}