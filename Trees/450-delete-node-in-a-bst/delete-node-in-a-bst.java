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
    public int findmin(TreeNode root) {
        int min = -1;
        while (root != null) {
            min = root.val;
            root = root.left;
        }
        return min;
    }

    public TreeNode deleteNode(TreeNode root, int k) {
        if (root == null)
            return null;

        if (k < root.val)
            root.left = deleteNode(root.left, k);
        else if (k > root.val)
            root.right = deleteNode(root.right, k);
        else {

            if (root.left == null)
                return root.right;
            else if (root.right == null)
                return root.left;
            root.val = findmin(root.right);

            root.right= deleteNode(root.right, root.val);

        }
        return root;
    }
}