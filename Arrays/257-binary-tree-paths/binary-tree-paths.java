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
    public void dfs(TreeNode root,String a){
        if(root==null)return;
        a+=root.val;

        if(root.left==null && root.right==null){
            ans.add(a);
        }
        a+="->";
        dfs(root.left,a);
        dfs(root.right,a);
    }
    public List<String> binaryTreePaths(TreeNode root) {
        

        if(root==null)return ans;
        dfs(root,"");
        return ans;
        
    }
}