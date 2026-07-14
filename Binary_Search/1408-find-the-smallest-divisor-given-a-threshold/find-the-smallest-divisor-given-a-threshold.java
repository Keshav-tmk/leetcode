class Solution {
    public boolean help(int []arr,int top,int mid){
        int sum=0;
        for(int i:arr){
            sum+=((i+mid-1)/mid);
        }
        if(sum<=top)return true;
        else return false;
    }
    public int smallestDivisor(int[] nums, int top) {
        int max=Integer.MIN_VALUE;
        // int min=Integer.MAX_VALUE;
        int ans=-1;
        for(int i:nums){
            max=Math.max(max,i);
            // min=Math.min(min,i);
        }
        int l=1,r=max;
        while(l<=r){
            int mid=l+(r-l)/2;
            if(help(nums,top,mid)){
                ans=mid;
                r=mid-1;
            }
            else l=mid+1;
        }
        return ans;
        
    }
}