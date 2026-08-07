class Solution {
    public int maxScore(int[] nums, int k) {
        int tsum=0,n=nums.length;
    for(int i:nums){
        tsum+=i;
    }
    if(n==k)return tsum;

    int size=n-k;
    int l=0,sum=0,min=Integer.MAX_VALUE;

    for(int i=0;i<n;i++){
        sum+=nums[i];

        if(i-l+1>=size){
           
            min=Math.min(sum,min);
             sum-=nums[l++];

        }
    }

    return tsum-min;

    



    }
}