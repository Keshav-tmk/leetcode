class Solution {
    public boolean help(int[] arr,int days,int cap){
        int sum=0,cnt=1;
        for(int i:arr){
            if(i>cap)return false;
            
            if(sum+i>cap){
                cnt++;
                sum=i;
            }
            else{
                sum+=i;
            }
            
        }
        if(cnt<=days)return true;
        return false;
    }
    public int shipWithinDays(int[] weights, int days) {
        int sum=0;
        for(int i:weights){
            sum+=i;
        }
        int l=1,r=sum,ans=0;

        while(l<=r)
        {
            int mid=l+(r-l)/2;
            if(help(weights,days,mid)){
                ans=mid;
                r=mid-1;
            }
            else l=mid+1;
        }
        return ans;
    }
}