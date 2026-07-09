class Solution {
    public char nextGreatestLetter(char[] arr, char target) {
        int n=arr.length;
        int low=0,high=n-1;
        char ans=arr[0];
        while(low<=high){
            int mid=low+(high-low)/2;
            if(arr[mid]>target){
                ans=arr[mid];
                high=mid-1;
            }
            else low=mid+1;
        }
        return ans;

        
    }
}