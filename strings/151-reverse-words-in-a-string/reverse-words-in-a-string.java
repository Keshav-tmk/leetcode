class Solution {
    public String reverse(String s) {
        char[] arr=s.toCharArray();
        int i = 0, j = arr.length - 1;
        while (i < j) {
            char t = arr[i];
            arr[i] = arr[j];
            arr[j] = t;
            i++;j--;
        }
        return new String(arr);
    }

    public String reverseWords(String s) {

        // String[] words=s.split(" +");
        // StringBuilder sb=new StringBuilder();
        // for(int i=words.length-1;i>=0;i--){
        //     sb.append(words[i]);
        //     sb.append(" ");
        //     }
        //     return sb.toString().trim();

        String s2 = s.trim();
       String s1= reverse(s2);
        String ans = "";
        int n = s1.length();
        for (int i = 0; i < n; i++) {
            String words = "";
            while (i < n && s1.charAt(i)!= ' ') {
                words += s1.charAt(i);
                i++;
            }
            String w1=reverse(words);
            if (w1.length() > 0)
                ans += " " + w1;

        }
        return ans.substring(1);

    }
}