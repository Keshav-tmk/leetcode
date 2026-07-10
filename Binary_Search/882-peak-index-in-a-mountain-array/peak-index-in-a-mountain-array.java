class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int n=arr.length;
        

        if(n==1)return arr[0];
        if(arr[0]>arr[1])return arr[0];
        if(arr[n-1]>arr[n-2])return arr[n-1];

        int l=1,r=n-2;

        while(l<=r){

            int mid=l+(r-l)/2;
            if(arr[mid]>arr[mid-1] && arr[mid]>arr[mid+1])return mid;
            else if(arr[mid-1]<arr[mid])l=mid+1;
            else if(arr[mid+1]<arr[mid])r=mid-1;
        }
        return 0;
        
    }
}