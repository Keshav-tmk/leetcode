class Solution {
    public int missingMultiple(int[] nums, int k) {
        Set<Integer> set=new HashSet<>();

        for(int i:nums){
            set.add(i);
        }
        int i;
        for(i=1;i<=100/k;i++){
            if(!set.contains(k*i))return k*i;
        }
        return k*(i);
        
    }
}