class Solution {
    public boolean checkDivisibility(int n) {
        int t=n;int sum=0,p=1;
        while(n!=0) {
            sum+=n%10;
            p*=n%10;
            n=n/10;
        } 

        if(t%(sum+p)==0)return true;
        return false;     
    }
}