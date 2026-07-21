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
    int max=Integer.MIN_VALUE;
    public int findh(TreeNode root){
        if(root==null)return 0;

        int l=Math.max(0,findh(root.left));//to ignore negatives 
        int r=Math.max(0,findh(root.right));//to ignore negatives 

        max=Math.max(max,root.val+l+r);

        return root.val+Math.max(0,Math.max(l,r));//to ignore negatives 
    }
    public int maxPathSum(TreeNode root) {
        findh(root);
        return max;

        
    }
}