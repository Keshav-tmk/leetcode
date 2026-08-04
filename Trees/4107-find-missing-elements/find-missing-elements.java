class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        int n = nums.length;
        Map<Integer, Integer> map = new HashMap<>();
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        List<Integer> ans = new ArrayList<>();

        for (int i : nums) {
            map.put(i, 1);
            min = Math.min(min, i);
            max = Math.max(max, i);
        }
        for (int i = min; i <= max; i++) {
            if (!map.containsKey(i))
                ans.add(i);
        }
        return ans;

    }
}