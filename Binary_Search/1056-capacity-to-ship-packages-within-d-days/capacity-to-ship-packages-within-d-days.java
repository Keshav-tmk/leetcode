class Solution {
    public int shipWithinDays(int[] weights, int days) {

        int max=0,sum=0;
        for(int i:weights){
            max=Math.max(max,i);
            sum+=i;
        }
        int low=max,high=sum,ans=0;

        // for(int i=low;i<=high;i++){

        //     if(ship(weights,days,i))return i;
        // }
        // return sum;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(ship(weights,days,mid)){
                ans=mid;
                high=mid-1;
            }
            else low=mid+1;
        }
        return ans;
        
    }
    public boolean ship(int[] arr,int days,int cap){
        int d=1,sum=0;
        for(int w:arr){
            sum+=w;
            if(sum>cap){
                d++;
                sum=w;
            }

            

        }if(d<=days)return true;
        return false;

    }
}