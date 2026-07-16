class Solution {
    public int gcd(int a, int b) {
        // if (b == 0)
        //     return a;
        // return gcd(b, a % b);
        while(b!=0){
            int t=b;
            b=a%b;
            a=t;

        }
        return a;
    }

    // public int findmax(int arr[], int n) {
    //     int max = Integer.MIN_VALUE;
    //     for (int i = 0; i <= n; i++) {
    //         max = Math.max(max, arr[i]);
    //     }
    //     return max;
    // }

    public long gcdSum(int[] nums) {

        int n = nums.length;
        int[] pre = new int[n];
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            // max = Math.max(max,nums[i]);
            if(nums[i]>max)max=nums[i];
            pre[i] = gcd(nums[i], max);

        }
        Arrays.sort(pre);

        int l = 0, r = pre.length - 1;long sum = 0;
        while (l < r) {
            sum += gcd(pre[l], pre[r]);

            l++;
            r--;

        }
        return sum;

    }
}