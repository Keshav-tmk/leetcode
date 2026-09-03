class Solution {
    public boolean uniformArray(int[] nums1) {
        boolean even=true,odd=true;
        int min=Integer.MAX_VALUE;

        for(int i:nums1){
            min=Math.min(min,i);

            if(i%2==0)odd=false;
            else even=false;
        }

        if(even||odd)return true;

        return min%2==1;

    }
}