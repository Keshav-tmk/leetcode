class Solution {
    // public int[] findpse(int[] nums){
    //     int n=nums.length;
    //     int [] pse=new int[n];
        
    //     Stack<Integer> st =new Stack<>();
    //     for(int i=0;i<nums.length;i++){
    //         while(!st.isEmpty() && nums[st.peek()]>=nums[i])st.pop();
    //         if(st.isEmpty())pse[i]=-1;
    //         else pse[i]=st.peek();
    //         st.push(i);
    //     }
    //     return pse;

    // }


    // public int[] findnse(int[] nums){
    //     int n=nums.length;
    //     int [] nse=new int[n];
        
    //     Stack<Integer> stt =new Stack<>();
    //     for(int i=n-1;i>=0;i--){
    //         while(!stt.isEmpty() && nums[stt.peek()]>=nums[i])stt.pop();
    //         if(stt.isEmpty())nse[i]=n;
    //         else nse[i]=stt.peek();
    //         stt.push(i);
    //     }
    //     return nse;

    // }
    // public int largestRectangleArea(int[] heights) {
    //     int n=heights.length;
    //     int [] nse=findnse(heights);
    //     int [] pse=findpse(heights);
    //     int max=0;

    //     for(int i=0;i<n;i++){
    //         int area=heights[i]*(nse[i]-pse[i]-1);
    //         max=Math.max(max,area);

    //     }return max;


       public int largestRectangleArea(int[] nums) {
        int n=nums.length;
        
        int max=0;
        int [] pse=new int[n];
        int [] nse=new int[n];
        
        Stack<Integer> st =new Stack<>();
        for(int i=0;i<n;i++){
            while(!st.isEmpty() && nums[st.peek()]>=nums[i])st.pop();
            if(st.isEmpty())pse[i]=-1;
            else pse[i]=st.peek();
            st.push(i);
        }
        st.clear();
        for(int i=n-1;i>=0;i--){
            while(!st.isEmpty() && nums[st.peek()]>=nums[i])st.pop();
            if(st.isEmpty())nse[i]=n;
            else nse[i]=st.peek();
            st.push(i);
        }




        for(int i=0;i<n;i++){
            int area=nums[i]*(nse[i]-pse[i]-1);
            max=Math.max(max,area);

        }return max; 
    }
}