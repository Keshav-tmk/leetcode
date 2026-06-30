class Solution {
    public int numberOfSubstrings(String s) {

        int l=0,cnt=0;
        int[] freq=new int[3];

        for(int r=0;r<s.length();r++){
            freq[s.charAt(r)-'a']++;
            while(freq[0]>0 && freq[1]>0 &&freq[2]>0){
            cnt+=s.length()-r;

            freq[s.charAt(l)-'a']--;l++;
        }

        }
return cnt;





    //     int n = s.length(), cnt = 0;

    //     for (int i = 0; i < n; i++) {
    //         Map<Character, Integer> map = new HashMap<>();
    //         for (int j = i; j < n; j++) {
    //             map.put(s.charAt(j), map.getOrDefault(s.charAt(j), 0) + 1);
    //             if (map.size() == 3)
    //                 cnt++;

    //         }
    //     }
    //     return cnt;
    }
}