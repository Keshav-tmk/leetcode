class Solution {
    public int searchInsert(int[] nums, int k) {
        int l=0,r=nums.length-1;
        int ans=nums.length;
        while(l<=r){
            int mid=l+(r-l)/2;
            if(nums[mid]>=k){
                ans=mid;
                r=mid-1;
                }
            else 
                l=mid+1;
        }


        return ans;

        
    }
}

