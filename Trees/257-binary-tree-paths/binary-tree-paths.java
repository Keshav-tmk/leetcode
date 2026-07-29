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
    List<String> list=new ArrayList<>();

    public void help(TreeNode root,String a){
        if(root==null)return ;
        a+=root.val;

        if(root.left==null && root.right==null)list.add(a);

        a+="->";
        help(root.left,a);
        help(root.right,a);
    }
    public List<String> binaryTreePaths(TreeNode root) {
        help(root,"");
        return list;
        
    }
}