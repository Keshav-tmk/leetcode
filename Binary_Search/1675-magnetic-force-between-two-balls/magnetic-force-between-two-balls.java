class Solution {
    public boolean help(int[] arr, int m, int mid) {

        Arrays.sort(arr); //this should be done remeber this
        int balls = 1, last = arr[0];

        int n = arr.length;
        for (int i = 1; i < n; i++) {
            if (arr[i] - last >= mid) {
                last = arr[i];
                balls++;
            }
        }
        if (balls >= m)
            return true;
        return false;
    }

    public int maxDistance(int[] arr, int m) {
        int max = Integer.MIN_VALUE;
        for (int i : arr) {
            max = Math.max(i, max);
        }

        int l = 1, r = max;
        int ans = 0;
        while (l <= r) {
            int mid = l + (r - l) / 2;
            if (help(arr, m, mid)) {
                ans = mid;
                l = mid + 1;
            } else
                r = mid - 1;

        }
        return ans;

    }
}