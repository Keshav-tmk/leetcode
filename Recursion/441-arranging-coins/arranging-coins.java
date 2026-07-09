class Solution {
    public int arrangeCoins(int n) {

        long l = 0, r = n;
        long ans = 0;
        while (l <= r) {
            long mid = l + (r - l) / 2;
            long coins = mid * (mid + 1) / 2;
            if (coins <= n) {
                ans = mid;
                l = mid + 1;
            } else {
                r = mid - 1;

            }

        }
        return (int)ans;
    }
}