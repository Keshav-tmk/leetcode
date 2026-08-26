class Solution {
    public String shortestBeautifulSubstring(String s, int k) {

        int n=s.length();
        int l=0;
        int min=Integer.MAX_VALUE;
        String ans="";
        int cnt1=0;

        for(int r=0;r<n;r++){
            char ch=s.charAt(r);

            if(ch=='1')cnt1++;
            while(cnt1>k){
                if(s.charAt(l++)=='1')cnt1--;
            }
            while (cnt1 == k && s.charAt(l) == '0') {
                l++;
            }
            if(cnt1==k){
                int len=r-l+1;
                String curr=s.substring(l,r+1);
                if(len<min  ||( len==min&& curr.compareTo(ans)<0) ){
                    min=len;
                    ans=curr;
                }
            }

        }
        return ans;
        
    }
}