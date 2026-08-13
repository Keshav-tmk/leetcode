class Solution {
    public String makeGood(String s) {
        
        Stack<Character> st=new Stack<>();
        StringBuilder sb=new StringBuilder();

        for(char ch:s.toCharArray()){
        
                
                if(!st.isEmpty() && Math.abs(st.peek()-ch)==32){
                    st.pop();
                }
            
            else
                st.push(ch);
        }

        while(!st.isEmpty()){
            sb.append(st.pop());

        }
        return sb.reverse().toString();
    }
}