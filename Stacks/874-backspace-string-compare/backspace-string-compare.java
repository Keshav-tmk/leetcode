class Solution {
    public String help(String s){
        Stack<Character> st=new Stack<>();
        StringBuilder res=new StringBuilder();
        
        for(char ch:s.toCharArray()){
           if (ch == '#') {
                if (!st.isEmpty())
                    st.pop();
            }
            else st.push(ch);
        }

        while(!st.isEmpty()){
            res.append(st.pop());
        }
        return res.reverse().toString();
    }
    public boolean backspaceCompare(String s, String t) {
       

    if(help(s).equals(help(t)))return true;
    return false;
        
    }
}