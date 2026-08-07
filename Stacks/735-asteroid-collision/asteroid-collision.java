class Solution {
    public int[] asteroidCollision(int[] nums) {
        Stack<Integer> st=new Stack<>();
        int n=nums.length;
        for(int i=0;i<n;i++){
           int  a=nums[i];

            while(!st.isEmpty() && st.peek()>0 &&a<0 && st.peek()<-a){
                st.pop();

            }
            if(!st.isEmpty()&&a<0&& st.peek()>0){
                if(st.peek()==-a)
                    st.pop();
            }
            else
                st.push(a);
        }

        int[]arr=new int[st.size()];
        while(!st.isEmpty()){
            for(int i=st.size()-1;i>=0;i--){
                arr[i]=st.pop();
            }
        }
        return arr;
        
    }
}