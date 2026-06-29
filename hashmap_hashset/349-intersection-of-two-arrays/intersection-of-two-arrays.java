// class Solution {
//     public int[] intersection(int[] nums1, int[] nums2) {
//         int n = nums1.length;
//         int m = nums2.length;
//         Arrays.sort(nums1);
//         Arrays.sort(nums2);

//         int i = 0, j = 0;
//         List<Integer> ans = new ArrayList<>();

//         while (i < n && j < m) {
//             if (nums1[i] < nums2[j])
//                 i++;
//             else if (nums1[i] > nums2[j])
//                 j++;
//             else {
//                 if (!ans.contains(nums1[i])) {
//                     ans.add(nums1[i]);

//                 }
//                 i++;
//                     j++;
//             }
//         }
//         int[] res = new int[ans.size()];
//         int k = 0;
//         for (int l : ans) {
//             res[k++] = l;

//         }
//         return res;
//     }
// }
class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set = new HashSet<>();
        ArrayList<Integer> ans = new ArrayList<>();

        for (int i : nums1)
            set.add(i);
        for (int i : nums2) {
            if (set.contains(i)){
                ans.add(i);
                set.remove(i);}
        }

        int[] res = new int[ans.size()];
        int k = 0;
        for (int i : ans) {
            res[k++] = i;
        }
        return res;

    }
}