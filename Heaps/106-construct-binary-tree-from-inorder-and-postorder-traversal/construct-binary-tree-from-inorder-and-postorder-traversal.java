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
    int idx=0;
    Map<Integer,Integer> map=new HashMap<>();
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        for(int i=0;i<inorder.length;i++){
            map.put(inorder[i],i);
        }
        
        return help(postorder,0,inorder.length-1);
    }
    public TreeNode help(int []postorder,int l,int r){

        if(l>r)
            return null;
        int n=postorder.length-1;
        int rootval=postorder[n-(idx++)];
        TreeNode root=new TreeNode(rootval);

        int mid=map.get(rootval);
         root.right=help(postorder,mid+1,r);

        root.left=help(postorder,l,mid-1);

       

        return root;
    }
}