class Solution {
    public boolean isvov(char c){
        if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u')return true;
        return false;
    }

    public int maxVowels(String s, int k) {
        int n=s.length();
        int l=0,cnt=0;;
        for(int i=0;i<k;i++){
             char ch =s.charAt(i);
            if(isvov(ch))cnt++;
        }
        int max=cnt,i=k;
            while(i<n){
            char ch =s.charAt(l);
            if(isvov(ch))
            cnt--;
            l++;
            if(isvov(s.charAt(i++)))
                cnt++;
            max=Math.max(max,cnt);    

            

            }
return max;
}


}