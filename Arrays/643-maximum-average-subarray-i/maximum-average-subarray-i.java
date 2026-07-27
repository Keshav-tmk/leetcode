class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double sum=0;
        for(int i=0;i<k;i++){
            sum+=nums[i];
        }
        double max=sum;int l=0;
        
        for(int r=k;r<nums.length;r++){
            sum+=nums[r];
            sum-=nums[l++];
            max=Math.max(max,sum);
        }
        return max/k;
        
    }
}