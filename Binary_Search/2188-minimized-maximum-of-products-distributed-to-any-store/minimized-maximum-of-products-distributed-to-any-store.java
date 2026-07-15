class Solution {
    public boolean help(int []arr,int n,int mid){
        int cnt=0;

        for(int i:arr){
            cnt+=(i+mid-1)/mid;

        }
        if(cnt<=n)return true;
        return false;
        

    }
    public int minimizedMaximum(int n, int[] arr) {
        int sum=0,max=0;
        for(int i:arr){
            max=Math.max(max,i);
        }
        int l=1,r=max,ans=0;

        while(l<=r){
            int mid=l+(r-l)/2;
            if(help(arr,n,mid)){
                ans=mid;
                r=mid-1;
            }
            else l=mid+1;
        }
        return ans;
        
    }
}