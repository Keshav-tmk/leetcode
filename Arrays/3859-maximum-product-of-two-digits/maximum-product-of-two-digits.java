class Solution {
    public int maxProduct(int n) {
        if(n==0)return 0;
        int max=0,smax=0;
        while(n!=0){
            int dig=n%10;
            if(max<=dig){
                smax=max;
                max=dig;
            }
            else if(smax<dig)smax=dig;

            n=n/10;
        }  
        return smax*max;

    }
}