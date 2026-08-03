class Solution {
    public boolean canPlaceFlowers(int[] arr, int k) {

        int n=arr.length;
        if(k==0)return true;
        if(n==1){
            if(arr[0]==0 &&k==1)return true;
        }



        for(int i=0;i<n;i++){
            if(i==0){
                if(arr[i]==0 && arr[i+1]==0){
                k--;
                if(k==0)return true;
                arr[i]=1;
                }
            }
            else if(i==n-1){
                if(arr[n-1]==0 && arr[n-2]==0){k--;
                if(k==0)return true;
                arr[i]=1;}

            }
            else{

            if(arr[i-1]==0 &&arr[i+1]==0 && arr[i]==0){
                k--;
                if(k==0)return true;
                arr[i]=1;
            }


            }
            
        }
        return false;
    }
}