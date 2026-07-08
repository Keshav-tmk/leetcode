class Solution {

    public void help(String curr,int o,int c,int n,List<String> ans){
        if(curr.length()==2*n){
            ans.add(curr);
            return;
        }
        if(o<n)help(curr+'(',o+1,c,n,ans);
        if(c<o)help(curr+')',o,c+1,n,ans);
        
            }

    public List<String> generateParenthesis(int n) {
        List<String> ans=new ArrayList<>();
        help("",0,0,n,ans);
        return ans; 

    }
}