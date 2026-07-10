class Solution {
    public void help(int i, int[] arr, List<Integer> curr, List<List<Integer>> ans) {
        if (i == arr.length) {
            ans.add(new ArrayList<>(curr));
            return ;
        }

        curr.add(arr[i]);
        help(i + 1, arr, curr, ans);
        curr.remove(curr.size() - 1);
        help(i + 1, arr, curr, ans);

        

    }

    public List<List<Integer>> subsets(int[] arr) {
         List<List<Integer>> ans=new ArrayList<>();

         help(0, arr, new ArrayList<Integer>(), ans);
return ans;
    }
}

