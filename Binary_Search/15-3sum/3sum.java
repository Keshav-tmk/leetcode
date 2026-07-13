class Solution {
    public List<List<Integer>> threeSum(int[] nums) {

        int n = nums.length;
        List<List<Integer>> ans = new ArrayList<>();
        Set<List<Integer>> set = new HashSet<>();// for list of integer
        

        for (int i = 0; i < n; i++) {
            Set<Integer> set1 = new HashSet<>();
            for (int j = i + 1; j < n; j++) {
                int req = -(nums[i] + nums[j]);
                if (set1.contains(req)) {
                    List<Integer> temp = new ArrayList<>();
                    temp.add(nums[i]);
                    temp.add(nums[j]);
                    temp.add(req);
                    Collections.sort(temp);
                    set.add(temp);
                }
                set1.add(nums[j]);

            }

        }
        return new ArrayList<>(set);

    }
}

// // class Solution {
// //     public List<List<Integer>> threeSum(int[] nums) {
// //         Arrays.sort(nums);
// //         int n=nums.length;
// //         List<List<Integer>> ans = new ArrayList<>();

// //         for(int i=0;i<n-2;i++){
// //             if(i>0 && nums[i]==nums[i-1])continue;

// //             int j=i+1;
// //             int k=n-1;

// //             while(j<k){
// //                 int sum=nums[i]+nums[j]+nums[k];
// //                 if(sum<0)j++;
// //                 else if(sum>0)k--;
// //                 else{ ArrayList<Integer> temp=new ArrayList<>();

// //                     Collections.addAll(temp,nums[i],nums[j],nums[k]);
// //                      ans.add(temp);
// //                     j++;k--;

// //                     while(j<k && nums[j]==nums[j-1])j++;
// //                      while(j<k && nums[k]==nums[k+1])k--;
// //                 }

// //             }

// //         }
// //         return ans;
// //   }
// // }

// //            int n=nums.length;
// //         Set<List<Integer>> set = new HashSet<>();

// //         for (int i = 0; i < n; i++) {
// //             for (int j = i + 1; j < n; j++) {
// //                 for (int k = j + 1; k < n; k++) {
// //                     if (nums[i] + nums[j] + nums[k] == 0) {
// //                         List<Integer> temp = Arrays.asList(nums[i], nums[j], nums[k]);
// //                         Collections.sort(temp);
// //                         set.add(temp);
// //                     }
// //                 }
// //             }
// //         }

// //         return new ArrayList<>(set);

//     class Solution {
//     public List<List<Integer>> threeSum(int[] nums) {
// int n=nums.length;

// ArrayList<ArrayList> ans=new ArrayList<>();

// Set<ArrayList<Integer>> set=new HashSet<>();

//         for(int i=0;i<n;i++){ 
//             Set<Integer> set1=new HashSet<>();

//             for(int j=i+1;j<n;j++){

//                 int req=-(nums[i]+nums[j]);
//                 if(set1.contains(req)){
//                     ArrayList<Integer> temp=new ArrayList<>();
//                     Collections.addAll(temp, nums[i],nums[j],req);
//                     Collections.sort(temp);
//                     set.add(temp);
//                }
//                set1.add(nums[j]);

//             }
//         }
//         return new ArrayList<>(set);

//     }
// }