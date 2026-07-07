class Solution {
    public long sumAndMultiply(int n) {
        String s = String.valueOf(n);
        StringBuilder sb = new StringBuilder();

        for (char ch : s.toCharArray()) {
            if (ch != '0')
                sb.append(ch);
        }if (sb.length() == 0) {
            return 0;
        }
        int sum = 0;
        for (int i = 0; i < sb.length(); i++) {
            sum += sb.charAt(i) - '0';
        }
        long ans = Long.parseLong(sb.toString());
        return ans * sum;

    }
}