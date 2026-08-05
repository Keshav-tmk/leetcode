class Solution {
    public int gcd(int a,int b){
        if(b==0)return a;
        return gcd(b,a%b);
    }
    public String gcdOfStrings(String s, String t) {
        if(!(s+t).equals(t+s))return "";
        int n=s.length();
        int m=t.length();
        int l=gcd(n,m);

        return s.substring(0,l);
        


        
    }
}