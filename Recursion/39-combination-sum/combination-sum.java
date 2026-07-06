class Solution {Set<List<Integer>> set=new HashSet<>();
    public  void comb(int i, int[] arr, List<List<Integer>> temp, List<Integer> ans, int target) {
        
        if (i == arr.length || target < 0)
            return;
        if (target == 0) {
            if(!set.contains(ans)){
                temp.add(new ArrayList<>(ans));
                set.add(ans);
            }
            return;
        }

        ans.add(arr[i]);
        comb(i + 1, arr, temp, ans, target - arr[i]);
        comb(i, arr, temp, ans, target - arr[i]);
        ans.remove(ans.size() - 1);
        comb(i + 1, arr, temp, ans, target);

    }

    public List<List<Integer>> combinationSum(int[] arr, int target) {

        List<List<Integer>> temp = new ArrayList<>();
        comb(0, arr, temp, new ArrayList<Integer>(), target);
        return temp;

    }
}