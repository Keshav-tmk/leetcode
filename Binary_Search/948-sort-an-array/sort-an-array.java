class Solution {
    public void mergesort(int[] arr,int l,int r){
        if(l<r){
            int mid=l+(r-l)/2;
            mergesort(arr,l,mid);
            mergesort(arr,mid+1,r);
            merge(arr,l,mid,r);


        }
    }
    public void merge(int[] arr,int l,int m,int r){
        int n1=m-l+1;
        int n2=r-m;
        int [] a=new int[n1];
        int [] b=new int[n2];


        for(int i=0;i<n1;i++){
            a[i]=arr[l+i];
        }
        for(int i=0;i<n2;i++){
            b[i]=arr[m+1+i];
        }

        int i=0,j=0,k=l;
        while(i<n1 &&  j<n2){
            if(a[i]<=b[j])arr[k++]=a[i++];
            else arr[k++]=b[j++];
        }
        while(i<n1){
            arr[k++]=a[i++];
        }
        while(j<n2){
            arr[k++]=b[j++];
        }
    }
    public int[] sortArray(int[] arr) {

        mergesort(arr,0,arr.length-1);
        return arr;
        
    }
}