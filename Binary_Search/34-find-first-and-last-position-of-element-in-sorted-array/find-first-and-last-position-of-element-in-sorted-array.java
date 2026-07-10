class Solution {
    public int left(int[] arr, int key) {
        int n = arr.length;
        int low = 0, high = n - 1;
        int ans = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == key) {
                ans = mid;
                high = mid - 1;
            } else if (arr[mid] > key)
                high = mid - 1;
            else {
                low = mid + 1;
            }
        }
        return ans;
    }

    public int right(int[] arr, int key) {
        int n = arr.length;
        int low = 0, high = n - 1;
        int ans = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == key) {
                ans = mid;
                low = mid + 1;
            } else if (arr[mid] > key)
                high = mid - 1;
            else {
                low = mid + 1;
            }
        }
        return ans;
    }

    public int[] searchRange(int[] nums, int target) {

        int i = left(nums, target);
        if (i == -1)
            return new int[] { -1, -1 };
        int j = right(nums, target);
        return new int[] { i, j };

        // int first=-1,last=-1;
        // for(int i=0;i<nums.length;i++){
        //     if(nums[i]==target){
        //         if(first==-1)first=i;
        //         last=i;
        //     }
        // }
        // return new int[]{first,last};

    }
}