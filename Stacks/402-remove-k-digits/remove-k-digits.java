class Solution {
    public String removeKdigits(String s, int k) {
        int n=s.length();
        if(n==k)return "0";
        Stack<Character> st=new Stack<>();

        for(char ch:s.toCharArray()){
            while(!st.isEmpty()&& st.peek()>ch &&k>0){
                st.pop();
                k--;
            }
            st.push(ch);
        }
        while(k>0){
            st.pop();
            k--;
        }
        StringBuilder sb=new StringBuilder();

    while(!st.isEmpty()){
        sb.append(st.pop());
    }
        sb.reverse();

        while(sb.length()>0 && sb.charAt(0)=='0')sb.deleteCharAt(0);

        if(sb.length()==0)return "0";
        else return sb.toString();
    }
}