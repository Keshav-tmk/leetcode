// class Solution {
//     public int lowerbound(int []arr,int m,int target){
//         // int l=0,r=m-1,ans=m;
//     //     while(l<=r){
//     //         int mid=l+(r-l)/2;
//     //         if(arr[mid]>=target){
//     //             ans=mid;
//     //             r=mid-1;
//     //         }
//     //         else l=mid+1;
//     //     }
//     //     return ans;

//     // }

// //     public int[] rowAndMaximumOnes(int[][] mat) {
// //         int n=mat.length;
// //         int m=mat[0].length;
// //         int cnt1=0,max=0;int idx=-1;
// //         for(int i=0;i<n;i++){
// //             int lb=lowerbound(mat[i],m,1);
// //             cnt1=m-lb;
// //             if(cnt1>max){
// //                 max=cnt1;
// //                 idx=i;
// //             }
// //         }


// //    return new int[]{idx, max};


//         // 
//     }
// }

class Solution {
    public int[] rowAndMaximumOnes(int[][] mat) {

        int max = 0;
        int idx = 0;

        for (int i = 0; i < mat.length; i++) {
            int cnt = 0;

            for (int j = 0; j < mat[0].length; j++) {
                if (mat[i][j] == 1) cnt++;
            }

            if (cnt > max) {
                max = cnt;
                idx = i;
            }
        }

        return new int[]{idx, max};
    }
}
