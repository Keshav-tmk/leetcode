// class Solution {
//     public int longestValidParentheses(String s) {
//         if (s.isEmpty())
//             return 0;
//         Stack<Integer> st = new Stack<>();
//         st.push(-1);
//         int max=0;

//         for (int i=0;i<s.length();i++) {
//             char ch=s.charAt(i);
//             if (ch == '(') {
//                 st.push(i);

//             } else {
//                 st.pop();

//                 if (st.isEmpty()) {
//                     st.push(i);
//                 } else {
//                     max = Math.max(max, i - st.peek());
//                 }

//             }
//         }
//         return max;

//     }
// }

class Solution {
    public int longestValidParentheses(String s) {
        int l=0,r=0;
        int max=0;

        for(char ch:s.toCharArray()){
            if(ch=='(')l++;
            else r++;

            if(l==r)max=Math.max(max,2*r);
            if(r>l){
                l=0;r=0;
            }
        }
        l=0;r=0;

        for(int i=s.length()-1;i>=0;i--){
            char ch=s.charAt(i);
            if(ch=='(')l++;
            else r++;
            if(l==r)max=Math.max(max,2*r);
            else if(l>r){
                l=0;r=0;
            }
        }
       return max;

    }
}