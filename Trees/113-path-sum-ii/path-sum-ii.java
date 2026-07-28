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
    List<List<Integer>> ans = new ArrayList<>();

    public void help(TreeNode root, int k, List<Integer> list) {
        if (root == null)
            return;

        list.add(root.val);
        if (root.left == null && root.right == null && root.val == k) {
            ans.add(new ArrayList<>(list));

        }

        if (root.left != null)
            help(root.left, k - root.val, list);
        if (root.right != null)
            help(root.right, k - root.val, list);

        list.remove(list.size() - 1);

    }

    public List<List<Integer>> pathSum(TreeNode root, int k) {
        help(root, k, new ArrayList<Integer>());
        return ans;

    }
}