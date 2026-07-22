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
    public boolean isCousins(TreeNode root, int x, int y) {
        Queue<TreeNode> q = new LinkedList<>();
        TreeNode x1 = new TreeNode(x);
        TreeNode y1 = new TreeNode(y);
        q.offer(root);
        while (!q.isEmpty()) {
            if (q.contains(x) && q.contains(y))
                return true;
            int n = q.size();
            Boolean foundx = false;
            Boolean foundy = false;

            for (int i = 0; i < n; i++) {
                TreeNode curr = q.poll();
                if (curr.val == x)
                    foundx = true;
                if (curr.val == y)
                    foundy = true;
                if(curr.left!=null && curr.right!=null)
                if (curr.left.val == x && curr.right.val == y || curr.left.val == y && curr.right.val == x)
                    return false;
                if (curr.left != null)
                    q.offer(curr.left);
                if (curr.right != null)
                    q.offer(curr.right);
            }
            if(foundx&&foundy)return true;
            if(foundx||foundy)return false;
        }
        return false;

    }
}