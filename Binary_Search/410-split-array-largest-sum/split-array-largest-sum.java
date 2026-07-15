class Solution {

    public boolean help(int[]arr,int k,int mid){
        int cnt=1,sum=0;
        for(int i:arr){
            if(sum+i>mid){
                cnt++;
                sum=i;
            }
            else sum+=i;
        }
        return cnt<=k;

    }
    public int splitArray(int[] nums, int k) {
        int sum=0,max=0;
        for(int i:nums){
            max=Math.max(max,i);
            sum+=i;
        }
        int l=max,r=sum,ans=0;
        while(l<=r){
            int mid=l+(r-l)/2;
            if(help(nums,k,mid)){
                ans=mid;
                r=mid-1;
            }
            else
                l=mid+1;

        }
        return ans;
        
        
    }
}