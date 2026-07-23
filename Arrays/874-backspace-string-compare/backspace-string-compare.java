class Solution {
    public String help(String s){
        Stack<Character> st=new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='#'){
                if(!st.isEmpty())
                    st.pop();
            }
            else st.push(ch);
        }
        String res="";
        while(!st.isEmpty()){
            res+=st.pop();
        }
        return res;
    }
    public boolean backspaceCompare(String s, String t) {

        if(help(s).equals(help(t)))return true;
        return false;
       
        
    }
}