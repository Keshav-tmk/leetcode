class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int[] arr = new int[nums.length];
        int idx=0;
        for (int i : nums) {
            if (i % 2 == 0)
                arr[idx++] = i;
        }
      

            for (int i : nums) {
                if (i % 2 != 0)
                    arr[idx++] = i;
            }
        
        return arr;

    }
}

// class Solution {
//     public int[] sortArrayByParity(int[] nums) {
//         int l = 0, r = nums.length - 1;

//         while (l < r) {
//             if (nums[l] % 2 > nums[r] % 2) {
//                 int temp = nums[l];
//                 nums[l] = nums[r];
//                 nums[r] = temp;
//             }

//             if (nums[l] % 2 == 0)
//                 l++;

//             if (nums[r] % 2 == 1)
//                 r--;
//         }

//         return nums;
//     }
// }