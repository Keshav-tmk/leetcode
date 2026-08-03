class Solution {
    public int findContentChildren(int[] g, int[] s) {

        int n=g.length;
        int m=s.length;
        Arrays.sort(g);
        Arrays.sort(s);

    int child=0,cookies=0;
    while(child<n && cookies<m){
        if(g[child]<=s[cookies])child++;

        cookies++;
    }
return child;
        
        
    }
}