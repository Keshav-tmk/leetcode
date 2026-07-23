class Solution {
    public String removeDuplicates(String s) {
        int n = s.length();
        Stack<Character> st=new Stack<>();
        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i);
            if (st.isEmpty() || st.peek() != ch) {
                st.push(ch);
            }
            else 
                st.pop();

        }
        String res = "";
        while (!st.isEmpty())
            res=st.pop()+res;
        return res;

    }
}