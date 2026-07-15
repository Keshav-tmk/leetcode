class Solution {
    public double findMedianSortedArrays(int[] a, int[] b) {
        int n1=a.length,n2=b.length;
        int n=n1+n2;

        int idx2=n/2;
        int idx1=(n/2)-1;
        double ele1=0,ele2=0;
        double cnt=0;

        int i=0,j=0;

        while(i<n1 && j<n2){
            if(a[i]<b[j]){
                if(cnt==idx1)ele1=a[i];
                if(cnt==idx2)ele2=a[i];
                cnt++;
                i++;

            }
            else{
                if(cnt==idx1)ele1=b[j];
                if(cnt==idx2)ele2=b[j];
                cnt++;
                j++;

            }
        }

        while(i<n1){
            if(cnt==idx1)ele1=a[i];
                if(cnt==idx2)ele2=a[i];
                cnt++;
                i++;
        }
        while(j<n2){
            if(cnt==idx1)ele1=b[j];
                if(cnt==idx2)ele2=b[j];
                cnt++;
                j++;

        }
        if(n%2==1)return ele2;
        else return (ele1+ele2)/2;
    }
}