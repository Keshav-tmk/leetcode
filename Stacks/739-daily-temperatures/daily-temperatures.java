class Solution {
    public int[] dailyTemperatures(int[] temp) {

        int n = temp.length;
        int[] arr = new int[n];

        Stack<Integer> st=new Stack<>();

        for(int i=n-1;i>=0;i--){
                      
            while(!st.isEmpty() && temp[st.peek()] <= temp[i]){
                st.pop();

            }
            if(st.isEmpty())arr[i]=0;
            else arr[i]=st.peek()-i;
            st.push(i);
        }
        























        // for (int i = 0; i < n; i++) {
        //     int cnt = 0;
        //     for (int j = i + 1; j < n; j++) {
        //         if (temperatures[i] < temperatures[j]) {
        //             cnt = j - i;
        //             break;

        //         }

        //     }
        //     arr[i] = cnt;

        // }
        return arr;

    }
}