class Solution {
    public String smallestPalindrome(String s) {
        int []  freq=new int[26];
        for(char ch:s.toCharArray()){
            freq[ch-'a']++;
        }
        char mid=0;
        StringBuilder left=new StringBuilder();
        for(int i=0;i<26;i++){
            if(freq[i]%2!=0){
                mid=(char) (i+'a');
                
            }

            int halfcount=freq[i]/2;

            for(int j=0;j<halfcount;j++){
                left.append((char)(i+'a'));
            }

         }
          StringBuilder right=new StringBuilder(left).reverse();
         if(mid!=0)left.append(mid);

        

         left.append(right);

         return left.toString();
         
        
    }
}