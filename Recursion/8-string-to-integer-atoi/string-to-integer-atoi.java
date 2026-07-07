class Solution {
    public int myAtoi(String t) {
        String s = t.trim();
        if (s.isEmpty())
            return 0;
        int i = 0, si = 1;
        long res = 0;   // make this long 
        if (s.charAt(i) == '-' || s.charAt(i) == '+') {
            si = s.charAt(i) == '-' ? -1 : 1;
            i++;
        }
        while (i < s.length() && Character.isDigit(s.charAt(i))) {
            res = res * 10 + s.charAt(i) - '0';

            if (res * si > Integer.MAX_VALUE)
                return Integer.MAX_VALUE;
            if (res * si < Integer.MIN_VALUE)
                return Integer.MIN_VALUE;
            i++;
        }
        return (int)(si * res);// return int 

    }
}