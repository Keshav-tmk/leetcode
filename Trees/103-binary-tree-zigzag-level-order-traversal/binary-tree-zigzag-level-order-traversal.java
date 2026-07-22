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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        Queue<TreeNode> q=new LinkedList<>();
        List<List<Integer>> ans=new ArrayList<>();

        if(root==null)return ans;
        
        boolean flag=true;

        q.offer(root);
        while(!q.isEmpty()){
            int n=q.size();
            LinkedList<Integer> list=new LinkedList<>();
            for(int i=0;i<n;i++){
               TreeNode curr=q.poll();
                if(flag==true)list.addLast(curr.val);
                else list.addFirst(curr.val);

                
                if(curr.left!=null)q.offer(curr.left);
                if(curr.right!=null)q.offer(curr.right);
            }
            flag=!flag;
            ans.add(list);
        }
        return ans;
        
    }
}