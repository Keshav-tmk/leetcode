class Solution {
    public int help(int i,int[]nums,int[]dp){
        if(i==0)return nums[i];
        if(i<0)return 0;
        if(dp[i]!=-1)return dp[i];

        int pick=nums[i]+help(i-2,nums,dp);
        int notpick=0+help(i-1,nums,dp);

        return dp[i]=Math.max(pick,notpick);
    }
    public int rob(int[] nums) {
        int n=nums.length;
        int []dp=new int[n+1];
        Arrays.fill(dp,-1);

        return help(n-1,nums,dp);
    }
}