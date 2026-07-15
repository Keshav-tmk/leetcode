class Solution {
    public List<Integer> findDuplicates(int[] arr) {
        List<Integer> ans=new ArrayList<>();

        for(int i=0;i<arr.length;i++){
            int idx=Math.abs(arr[i])-1;
            if(arr[idx]<0){
                ans.add(Math.abs(arr[i]));
            }
            else {
                arr[idx]*=-1;
            }

        }
        return ans;
        
    }
}