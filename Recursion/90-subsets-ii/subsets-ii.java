class Solution {
    // public List<List<Integer>> subseq(int[] arr, int idx, ArrayList<Integer> list) {
    //     List<List<Integer>> temp = new ArrayList<>();
    //     if (idx == arr.length) {
    //         List<List<Integer>> ans = new ArrayList<>();
    //         ans.add(new ArrayList<>(list));
    //         return ans;

    //     }

    //     list.add(arr[idx]);
    //     List<List<Integer>> left = subseq(arr, idx + 1, list);

    //     list.remove(list.size() - 1);
    //     List<List<Integer>> right = subseq(arr, idx + 1, list);

    //     left.addAll(right);
    //     Set<List<Integer>> set = new HashSet<>();
    //     for (int i = 0; i < left.size(); i++) {
    //         set.add(left.get(i));
    //     }

    //     for (List<Integer> a : set) {
    //         temp.add(new ArrayList<>(a));

    //     }
    //     return temp;

    // }
      public List<List<Integer>> subseq(int[] arr) {
        
         List<List<Integer>> outer=new ArrayList<>();
         outer.add(new ArrayList<>());

         int st=0,end=0;

         for(int i=0;i<arr.length;i++){
             st=0;
            if(i>0 && arr[i]==arr[i-1])st=end+1;

            end=outer.size()-1;
            int n=outer.size();
            for(int j=st;j<n;j++){
                List<Integer> internal=new ArrayList<>(outer.get(j));
                internal.add(arr[i]);
                outer.add(internal);
            }
         }
         return outer;
     }

    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        ArrayList<Integer> list = new ArrayList<>();
        // return subseq(nums, 0, list);
        return subseq(nums);

    }
}