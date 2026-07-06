class Solution {
    public double pow(long n,double x) {
        
        if(n==0)return 1;
        if(n==1)return x;
        if (n % 2 == 0) {
            
            return pow(n/2,x * x);
        }

        return x*pow(n-1,x);
    }

    public double myPow(double x, int n) {
                long N = n;

    if(N<0)return 1.0/pow(-N,x);
     return pow(N,x);

    }
}