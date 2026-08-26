class Solution {
    public int longestConsecutive(int[] nums) {

        Set<Integer> set = new HashSet<>();
        for (int i : nums) {
            set.add(i);
        }

        int max = 0;

        for (int i : set) {

            if (!set.contains(i - 1)) {
               int  curr = i;
                int cnt=1;

                while (set.contains(curr + 1)) {
                    cnt++;
                    curr = curr + 1;
                }
                max=Math.max(max,cnt);
            }
        }
    return max;
    }
}