/**
 * // This is MountainArray's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface MountainArray {
 *     public int get(int index) {}
 *     public int length() {}
 * }
 */

class Solution {
    public int bs(int k, MountainArray arr, int l, int r, boolean flag) {
        while (l <= r) {
            int mid = l + (r - l) / 2;
            if (arr.get(mid) == k)
                return mid;
            if (flag) {

                if (arr.get(mid) < k)
                    l = mid + 1;
                else
                    r = mid -1;
            }

            else {

                if (arr.get(mid) < k)
                    r = mid - 1;
                else
                    l = mid + 1;
            }

        }
        return -1;
    }

    public int findInMountainArray(int target, MountainArray arr) {
        int n = arr.length();
        int l = 0, r = n - 1;
        while (l < r) {
            int mid = l + (r - l) / 2;

            if (arr.get(mid) < arr.get(mid + 1))
                l = mid + 1;
            else
                r = mid - 1;
        }
        int peak = l;

        int res = bs(target, arr, 0, peak, true);

        if (res != -1)
            return res;
        return bs(target, arr, peak + 1, n-1, false);

    }
}