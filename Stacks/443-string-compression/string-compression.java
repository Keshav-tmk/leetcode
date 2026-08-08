class Solution {
    public int compress(char[] nums) {

        int idx=0,i=0;
        int n=nums.length;

        while(i<n){
            char ch=nums[i];
            int cnt=0;
            while(i<n &&ch==nums[i]){
                cnt++;
                i++;
            }
            nums[idx++]=ch;
            if(cnt>1){
                
                String s=String.valueOf(cnt);

                for(char c:s.toCharArray()){
                    nums[idx++]=c;
                }

            }
        }

        return idx;
        
    }
}