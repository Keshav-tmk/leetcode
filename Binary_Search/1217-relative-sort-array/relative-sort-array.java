class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        
        int freq[]=new int[1001];
        for(int i:arr1)
            freq[i]++;
        int i=0;
        for(int x:arr2){
            while(freq[x]>0){
                arr1[i++]=x;
                freq[x]--;
                
            }
        }  

        for(int j=0;j<=1000;j++){
            while(freq[j]>0){
                arr1[i++]=j;
                freq[j]--;}


        }   

        return arr1;   
    }
}