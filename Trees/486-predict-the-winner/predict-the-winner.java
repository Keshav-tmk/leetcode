// class Solution {
//     public boolean predictTheWinner(int[] nums) {
//         return help(nums,0,nums.length-1,0,0,true);      
//     }

//     public boolean help(int[] nums,int i,int j,int p1,int p2,boolean turn)
//     {
//         if(i>=nums.length && j<0 &&i>j){
//             if(p1>=p2)return true;
//             else return false;
//         }
//         if(turn==true){
//                 int max=Math.max(nums[i],nums[j]);
//                 int next=Math.max(nums[i+1],nums[j]);
//             if(next>max)
//                 return help(nums,i,j-1,p1+max,p2,false);
//             else 
//                 return  help(nums,i+1,j,p1+max,p2,false) ;
//         }
//         else{
//             int max=Math.max(nums[i],nums[j]);
//            int next=Math.max(nums[i],nums[j-1]);
//             if(next>max)
//                 return help(nums,i,j-1,p1,p2+max,true);
//             else 
//                 return  help(nums,i+1,j-1,p1,p2+max,true);
//         }
//     }

// }
class Solution {
    public boolean predictTheWinner(int[] nums) {
        return help(nums,0,nums.length-1,0,0,true);      
    }

    public boolean help(int[] nums,int i,int j,int p1,int p2,boolean turn)
    {
        if(i>j){
            if(p1>=p2)return true;
            else return false;
        }
        if(turn==true){
                
          return  help(nums,i+1,j,p1+nums[i],p2,false) || help(nums,i,j-1,p1+nums[j],p2,false);
        }
        else{
           return help(nums,i+1,j,p1,p2+nums[i],true) && help(nums,i,j-1,p1,p2+nums[j],true);
        }
    }

}