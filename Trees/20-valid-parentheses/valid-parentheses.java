class Solution {
    public boolean isSame(char close,char open){
        if(open=='{'&&close=='}' ||open=='['&&close==']' ||open=='('&&close==')')return true;
         return false;

    }
    public boolean isValid(String s) {
        Stack<Character> st=new Stack<>();
        int n=s.length();
        if(n%2==1)return false;

        for(int i=0;i<n;i++){
            char ch=s.charAt(i);
            if(ch=='('||ch=='['||ch=='{'){
                st.push(ch);
            }
            else{
                if(st.isEmpty()|| !isSame(ch,st.pop()))return false;
                
            }
        }
        if(st.isEmpty())
             return true;
        return false;

    }
}