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
    public int maxLevelSum(TreeNode root) {
        Queue<TreeNode> q=new LinkedList<>();

        if(root==null)return 0;
        int max=Integer.MIN_VALUE,ans=0;
        int idx=0;
        q.offer(root);
        while(!q.isEmpty()){
            int sum=0;
            int n=q.size();

            for(int i=0;i<n;i++){
                TreeNode curr=q.poll();
                sum+=curr.val;

                if(curr.left!=null)q.offer(curr.left);
                if(curr.right!=null)q.offer(curr.right);

            }

            if(sum>max){
                max=sum;
                ans=idx+1;
            }
            idx++;

        }
        return ans;
    }
}