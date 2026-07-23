class Solution {
        public int  eval(int n1,int n2,String op){
            
        if(op.equals("+"))return n1+n2;
        if(op.equals("-"))return n1-n2;
        if(op.equals("*"))return n1*n2;
        if(op.equals("/"))return n1/n2;


    return 0;
            
        }
    public int evalRPN(String[] tokens) {
        Stack<Integer> st=new Stack<>();
        int n2,n1;

        for(String s: tokens){
            if(s.equals("+")||s.equals("-")||s.equals("/")||s.equals("*")){
                
                     n2=st.pop();
                     n1=st.pop();
                int res=eval(n1,n2,s);
                st.push(res);
            }
            else{
                    st.push(Integer.valueOf(s));

            }
            

        }return st.pop();

        
    }
}