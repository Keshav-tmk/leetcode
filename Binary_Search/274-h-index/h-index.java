class Solution {
    public int hIndex(int[] citations) {
            int n=citations.length;
        //create a new array of size greater than citations.length
        int [] arr=new int[n+1];
        int cnt=0;

        for(int i:citations){
            if(i>n)    
                arr[n]++;
            else
                arr[i]++;                           
        }
        for(int i=n;i>=0;i--){
            cnt+=arr[i];
            if(cnt>=i)return i;
        }
        return 0;
    }
}