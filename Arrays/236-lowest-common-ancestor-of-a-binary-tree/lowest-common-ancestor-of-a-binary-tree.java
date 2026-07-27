/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    List<TreeNode> ans1=new ArrayList<>();
    List<TreeNode> ans2=new ArrayList<>();
    public boolean help1(TreeNode root,TreeNode target){
        if(root==null)return false;
        ans1.add(root);

        if(root==target)return true;

        if(help1(root.left,target)||help1(root.right,target))return true;
        ans1.remove(ans1.size()-1);
        return false;
    }
    public boolean help2(TreeNode root,TreeNode target){
        if(root==null)return false;
        ans2.add(root);

        if(root==target)return true;

        if(help2(root.left,target)||help2(root.right,target))return true;
        ans2.remove(ans2.size()-1);
        return false;
    }
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {

        if(root==null)return null;

        help1(root,p);
        help2(root,q);
        TreeNode ans=null;
        int n=ans1.size();
        int m=ans2.size();

        for(int i=0;i<Math.min(n,m);i++){
            if(ans1.get(i)==ans2.get(i)){
                ans=ans1.get(i);
            }
        }
        return ans;
        
        
    }
}