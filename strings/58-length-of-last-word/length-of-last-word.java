class Solution {
    public int lengthOfLastWord(String s) {
        String s1=s.trim();
        int n=s1.length();
        int cnt=0;

        for(int i=n-1;i>=0;i--){
            if(s1.charAt(i)==' ')break;
            cnt++;
        }
        return cnt;
        
    }
}