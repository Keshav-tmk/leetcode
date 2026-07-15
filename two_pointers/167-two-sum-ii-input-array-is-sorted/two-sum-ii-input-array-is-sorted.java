// class Solution {
//     public int[] twoSum(int[] numbers, int target) {

// int left = 0;
//         int right = numbers.length - 1;

//         while(left < right) {

//             int sum = numbers[left] + numbers[right];

//             if(sum == target) {
//                 return new int[]{left + 1, right + 1};
//             }
//             else if(sum < target) {
//                 left++;
//             }
//             else {
//                 right--;
//             }
//         }

//         return new int[]{-1, -1};












// //         HashMap<Integer,Integer> map=new HashMap<>();
// //         int n=nums.length ,i=-1,j=-1;
// //         for(i=0;i<n;i++){
// //             int req=target-nums[i];

// //             int low=i+1,high=n-1;
// //             while(low<=high){
// //                 int mid=low+(high-low)/2;
// //                 if(nums[mid]==req){
// //                     return new int[] {i+1,mid+1};
// //                 }
// //                 else if(nums[mid]<req)low=mid+1;
// //                 else high=mid-1;
// //             }

// //         }
// // return new int []{i,j};

//     }
// }


//         // for( i=0;i<n;i++){
//         //     int req=target-nums[i];
//         //     if(map.containsKey(req)){
//         //          j=map.get(req);
//         //          return new int[] {j+1,i+1};
                
//         //     }
//         //     map.put(nums[i],i);
//         // }
        
//         // return new int[] {-1,-1};
class Solution {
    public int[] twoSum(int[] arr, int target) {
        Map<Integer,Integer> map=new HashMap<>();
        int n=arr.length;

        for(int i=0;i<n;i++){
            int req=target-arr[i];
            if(map.containsKey(req))
                return new int[]{map.get(req)+1,i+1};
            map.put(arr[i],i);

        }
        return new int[]{};
        
    }
}