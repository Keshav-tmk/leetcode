class Solution {
    public List<List<Integer>> subseq(int[] arr,int idx , ArrayList<Integer> list){
    List<List<Integer>> temp=new ArrayList<>();
        if(idx==arr.length){
            List<List<Integer>> ans=new ArrayList<>();
            ans.add(new ArrayList<>(list));
            return ans;

        }

        list.add(arr[idx]);
        List<List<Integer>> left = subseq(arr, idx + 1, list);

        list.remove(list.size()-1);
        List<List<Integer>> right = subseq(arr, idx + 1, list);

    left.addAll(right);
    Set<List<Integer>> set=new HashSet<>();
    for(int i=0;i<left.size();i++){
        set.add(left.get(i));
    }

    for(List<Integer> a: set){
        temp.add(new ArrayList<>(a));

    }
return temp;


    } 

    
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        ArrayList<Integer> list=new ArrayList<>();
        return subseq(nums,0,list);
        
    }
}