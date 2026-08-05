class Solution {
    public int[] findErrorNums(int[] nums) {
        int n=nums.length;
        int []freq=new int[n+1];

        int temp=0,mis=0;
        for(int i=0;i<n;i++){
            freq[nums[i]]++;

        }
        for(int i=1;i<=n;i++){
            if(freq[i]==0)mis=i;
            if(freq[i]==2)temp=i;
        }

        return new int[] {temp,mis};
        
    }
}