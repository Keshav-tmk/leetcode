class Solution {
    public static void comb(int i, int[] arr, List<List<Integer>> temp, List<Integer> ans, int target) {
        if (i == arr.length) {
            if (target == 0) {

                temp.add(new ArrayList<>(ans));

            }
            return;
        }
        if (arr[i] <= target) {
            ans.add(arr[i]);
            comb(i, arr, temp, ans, target - arr[i]);
            ans.remove(ans.size() - 1);
        }
        comb(i + 1, arr, temp, ans, target);

    }

    public List<List<Integer>> combinationSum(int[] arr, int target) {

        List<List<Integer>> temp = new ArrayList<>();
        comb(0, arr, temp, new ArrayList<Integer>(), target);
        return temp;

    }
}