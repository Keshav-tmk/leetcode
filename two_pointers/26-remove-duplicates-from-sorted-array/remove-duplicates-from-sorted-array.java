class Solution {
    public int removeDuplicates(int[] arr) {
        int n=arr.length;
        int k=0;

        for(int i:arr){
            if(k==0 || arr[k-1]!=i){
                arr[k++]=i;
            }
        }
        return k;
        
    }
}