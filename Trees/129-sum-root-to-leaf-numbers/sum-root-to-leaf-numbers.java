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
    List<String> ans=new ArrayList<>();
    public void help(TreeNode root,String a){
        if(root==null)return;

        a+=root.val;
        if(root.left==null&&root.right==null)ans.add(a);

        help(root.left,a);
        help(root.right,a);

    }
    public int sumNumbers(TreeNode root) {
        if (root==null)return 0;
        help(root,"");
        int sum=0;
        for(String s:ans){
            sum+=Integer.valueOf(s);
        }
        return sum;
        
    }
}