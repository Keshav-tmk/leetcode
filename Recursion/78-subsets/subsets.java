class Solution {
    // public List<List<Integer>> subseq(int[] arr, int idx, ArrayList<Integer> list) {
    //     if (idx == arr.length) {
    //         List<List<Integer>> ans = new ArrayList<>();
    //         ans.add(new ArrayList(list));
    //         return ans;

    //     }

    //     list.add(arr[idx]);
    //     List<List<Integer>> left = subseq(arr, idx + 1, list);

    //     list.remove(list.size() - 1);
    //     List<List<Integer>> right = subseq(arr, idx + 1, list);

    //     left.addAll(right);
    //     return left;

    // }

    public List<List<Integer>> subseq(int[] arr) {
        List<List<Integer>> outer = new ArrayList<>();
        outer.add(new ArrayList<>());

        for (int num : arr) {
            int n=outer.size();
            for (int i = 0; i< n; i++) {
                List<Integer> internal = new ArrayList<>(outer.get(i));
                internal.add(num);
                outer.add(internal);
            }
        }
        return outer;
    }

    public List<List<Integer>> subsets(int[] nums) {
        ArrayList<Integer> list = new ArrayList<>();
        // return subseq(nums, 0, list);
        return subseq(nums);

    }

}