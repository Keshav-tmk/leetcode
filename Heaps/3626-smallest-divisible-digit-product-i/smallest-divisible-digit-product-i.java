class Solution {
    public int digprod(int n){
        int prod=1;
        while(n!=0){
            prod*=n%10;
            n=n/10;
        }
        return prod;
    }
    public int smallestNumber(int n, int t) {
        int prod=0,ans=0;
        
        for(int i=n;i<=100;i++){
            prod=digprod(i);
            if(prod%t==0)
            {
                ans=i;
                break;
            }

           
        }
        return ans; 
        
    }
}