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
    class pair{
        int idx;
        TreeNode node;
        pair(TreeNode node ,int idx){
            this.node=node;
            this.idx=idx;
        }
    }

    public int widthOfBinaryTree(TreeNode root) {
        Queue<pair> q=new LinkedList<>();
    int ans=0;
        q.offer(new pair(root,0));

        while(!q.isEmpty()){


            int min=q.peek().idx;

            int n=q.size();
        int first=0;
        int last=0;

            for(int i=0;i<n;i++){

                pair p=q.poll();
                int curr=p.idx-min;

                if(i==0)first=curr;
                if(i==n-1)last=curr;


                if(p.node.left!=null)q.offer(new pair(p.node.left,2*curr+1));
                if(p.node.right!=null)q.offer(new pair(p.node.right,2*curr+2));
            }

            ans=Math.max(ans,last-first+1);
        }
        return ans;
    }
}