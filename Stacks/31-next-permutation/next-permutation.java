class Solution {
public void reverse(int[]arr,int i,int j){
    while(i<j){
        int t=arr[i];
        arr[i]=arr[j];
        arr[j]=t;

        i++;
        j--;
    }
}

    public void nextPermutation(int[] nums) {
        int n=nums.length;
        int idx=-1;
        for(int i=n-2;i>=0;i--){
            if(nums[i]<nums[i+1]){
                idx=i;
                break;
            }
        }

        if(idx==-1){
            reverse(nums,0,n-1);
            return;
        }
        
        for(int i=n-1;i>=0;i--){
            if(nums[idx]<nums[i]){
                int t=nums[idx];
                nums[idx]=nums[i];
                nums[i]=t;
                break;
                
            }

        }

        reverse(nums,idx+1,n-1);
        return ;
       
        
    }
}