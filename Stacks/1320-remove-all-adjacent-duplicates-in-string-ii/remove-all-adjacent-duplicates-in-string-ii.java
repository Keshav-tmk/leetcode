class Solution {
    class pair{
        char c;
        int cnt;
        pair(char c,int cnt){
            this.c=c;
            this.cnt=cnt;
        }
    }
    public String removeDuplicates(String s, int k) {
        Stack<pair> st=new Stack<>();
        StringBuilder sb=new StringBuilder();
        

        for(char ch:s.toCharArray()){

            if(!st.isEmpty() && st.peek().c==ch){
                st.peek().cnt++;
                if(st.peek().cnt==k)st.pop();
            }
            else{
                
                st.push(new pair(ch,1));
            }

        }
    while(!st.isEmpty()){
        pair curr=st.pop();

        while(curr.cnt-->0){
            sb.append(curr.c);
        }
    }
    return sb.reverse().toString();
        
    }
}