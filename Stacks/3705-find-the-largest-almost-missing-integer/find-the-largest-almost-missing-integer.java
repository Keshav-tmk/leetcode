class Solution {
    public int largestInteger(int[] nums, int k) {
        int n = nums.length;

        // Case 1
        if (k == 1) {
            Map<Integer, Integer> map = new HashMap<>();

            for (int x : nums) {
                map.put(x, map.getOrDefault(x, 0) + 1);
            }

            int ans = -1;

            for (int x : nums) {
                if (map.get(x) == 1) {
                    ans = Math.max(ans, x);
                }
            }

            return ans;
        }

        // Case 2
        if (k == n) {
            int max = 0;

            for (int x : nums) {
                max = Math.max(max, x);
            }

            return max;
        }

        // Case 3: 1 < k < n
        Map<Integer, Integer> map = new HashMap<>();

        for (int x : nums) {
            map.put(x, map.getOrDefault(x, 0) + 1);
        }

        int ans = -1;

        if (map.get(nums[0]) == 1) {
            ans = Math.max(ans, nums[0]);
        }

        if (map.get(nums[n - 1]) == 1) {
            ans = Math.max(ans, nums[n - 1]);
        }

        return ans;
    }
}