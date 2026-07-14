class Solution {
    public boolean help(int[] arr,double hour,int mid){
        double cnt=0;
        int n=arr.length;

        for(int i=0;i<n-1;i++){
            int a=arr[i];
            cnt+=(a+mid-1)/mid;
            }
            cnt+=(double)arr[n-1]/mid;

            
            return cnt<=hour;
    }
    public int minSpeedOnTime(int[] arr, double hour) {

        int l=1,r=1_000_000_0, ans=-1;;
        while(l<=r){
            int mid=l+(r-l)/2;
            if(help(arr,hour,mid)){
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