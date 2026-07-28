/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public int pathSum(TreeNode root, int k) {
        Map<Long,Integer>map=new HashMap<>();
        map.put(0L,1);

        return help(root,map,k,0);
        
    }
    public int help(TreeNode root,Map<Long,Integer>map,int k,long curr){
        if(root==null)return 0;

        curr+=root.val;

        int cnt=map.getOrDefault(curr-k,0);

        map.put(curr,map.getOrDefault(curr,0)+1);

        cnt+=help(root.left,map,k,curr);
        cnt+=help(root.right,map,k,curr);

        map.put(curr,map.get(curr)-1);
        return cnt;
    }
}