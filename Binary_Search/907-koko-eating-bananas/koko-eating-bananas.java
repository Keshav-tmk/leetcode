class Solution {
    public int minEatingSpeed(int[] piles, int h) {
    int max=0,ans=0;

    for(int i :piles){
        max=Math.max(i,max);
    }
    int l=1,r=max;

    while(l<=r){
        int mid=l+(r-l)/2;

        if(pile(piles,h,mid))
        {
            ans=mid;
            r=mid-1;

        }
        else l=mid+1;
    }
      return ans;  
    }
    public boolean pile(int [] arr,int hour,int k){
        long h=0;
        for(int i:arr){
            h+=(i+k-1)/k;
        }
        if(h<=hour)return true;
        return false;

    }
}