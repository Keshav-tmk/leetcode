class Solution {

    public void comb(int idx, int[] arr, List<List<Integer>> temp, List<Integer> ans, int t) {

        if (t == 0) {

            temp.add(new ArrayList<>(ans));

            return;
        }
        for (int i = idx; i < arr.length; i++) {
            if (i > idx && arr[i] == arr[i - 1])
                continue;

            if (arr[i] > t) {
                break;
            }

            ans.add(arr[i]);
            comb(i + 1, arr, temp, ans, t - arr[i]);
            ans.remove(ans.size() - 1);

        }
    }

    public List<List<Integer>> combinationSum2(int[] arr, int target) {
        Arrays.sort(arr);

        List<List<Integer>> temp = new ArrayList<>();
        comb(0, arr, temp, new ArrayList<>(), target);
        return temp;

    }
}