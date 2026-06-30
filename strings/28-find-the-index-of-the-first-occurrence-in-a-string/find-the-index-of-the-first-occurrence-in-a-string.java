class Solution {
    public int strStr(String s, String p) {
        int n = s.length();
        int m = p.length();

        for (int i = 0; i <= n - m; i++) {
            int j = 0;
            while (j < m &&  p.charAt(j) == s.charAt(i + j))
                j++;

            if (j == m)
                return i;
        }
        return -1;

    }
}