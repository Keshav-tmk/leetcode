class Solution {
    public int[] nextGreaterElements(int[] arr) {

        int n = arr.length;
        int[] nge = new int[n];
        Stack<Integer> st = new Stack<>();

        for (int i = 2 * n - 1; i >= 0; i--) {
            int index = i % n;
            while (!st.isEmpty() && st.peek() <= arr[index])
                st.pop();

            if (i < n) {
                if (st.isEmpty())
                    nge[i] = -1;
                else
                    nge[i] = st.peek();
            }

            st.push(arr[index]);
        }

        return nge;

        // int n = arr.length;
        // int[] nge = new int[n];

        // for (int i = 0; i < n; i++) {
        //    int next=-1;

        //     for (int j = 1; j <n; j++) {
        //         int idx =(i+ j) % n;
        //         if (arr[idx] > arr[i]) {
        //             next=arr[idx];
        //             break;
        //         } 

        //     } nge[i]=next;
        // }
        // return nge;

    }
}