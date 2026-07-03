class Solution {
    public static List<List<Integer>> subseqsum(int[] arr, ArrayList<Integer> ans, int i, int k) {
        if (i >= arr.length) {

            if (ans.size() == k) {
                List<List<Integer>> temp = new ArrayList<>();
                temp.add(new ArrayList<>(ans));
                return temp;

            }
            return new ArrayList<>();
        }

    

    ans.add(arr[i]);

    List<List<Integer>> left = subseqsum(arr, ans, i + 1, k);ans.remove(ans.size()-1);
    List<List<Integer>> right = subseqsum(arr, ans, i + 1, k);

    left.addAll(right);

    return left;

    }

    public List<List<Integer>> combine(int n, int k) {
        int[] arr = new int[n];
        int val = 1;
        for (int i = 0; i < n; i++) {
            arr[i] = val++;

        }

        return subseqsum(arr, new ArrayList<Integer>(), 0, k);

    }
}