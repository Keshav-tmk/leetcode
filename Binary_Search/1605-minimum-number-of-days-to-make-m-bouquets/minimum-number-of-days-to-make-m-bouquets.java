class Solution {
    public boolean help(int[]arr,int m,int k,int mid){
        int cnt=0,mb=0;
        for(int i:arr){
            if(i<=mid){
                cnt++;
                if(cnt==k){
                    mb++;
                    cnt=0;
                }
            }
            else cnt=0;
        }
        if(mb>=m)return true;
        return false;
    }
    public int minDays(int[] arr, int m, int k) {
        long n=arr.length;
        if(n<m*k)return -1;
        int max=Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int ans=-1;

        for(int i:arr){
        max=Math.max(max,i);
        min=Math.min(min,i);
        }
        int l=min,r=max;
        while(l<=r){
            int mid=l+(r-l)/2;
            if(help(arr,m,k,mid)){
                ans=mid;
                r=mid-1;
            }
            else{
                l=mid+1;
            }
        }
        return ans;
        
    }
}