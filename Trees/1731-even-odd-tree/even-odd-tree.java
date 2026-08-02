// /**
//  * Definition for a binary tree node.
//  * public class TreeNode {
//  *     int val;
//  *     TreeNode left;
//  *     TreeNode right;
//  *     TreeNode() {}
//  *     TreeNode(int val) { this.val = val; }
//  *     TreeNode(int val, TreeNode left, TreeNode right) {
//  *         this.val = val;
//  *         this.left = left;
//  *         this.right = right;
//  *     }
//  * }
//  */
// class Solution {
//     public boolean isvalid(List<Integer> list, boolean even) {
//         if (even == true) {
//             for (int i = 1; i < list.size(); i++) {
//                 if (list.get(i) <= list.get(i - 1))
//                     return false;
//             }

//         } else {
//             for (int i = 1; i < list.size(); i++) {
//                 if (list.get(i) >= list.get(i - 1))
//                     return false;
//             }

//         }
//         return true;
//     }

//     public boolean isEvenOddTree(TreeNode root) {

//         if (root == null)
//             return true;
//         Queue<TreeNode> q = new LinkedList<>();

//         q.offer(root);
//         boolean even = true;

//         while (!q.isEmpty()) {
//             int n = q.size();
//             List<Integer> list = new ArrayList<>();

//             for (int i = 0; i < n; i++) {
//                 TreeNode curr = q.poll();
//                 if (even == true) {
//                     if (curr.val % 2 == 0)
//                         return false;
//                 }
//                 if (even == false) {
//                     if (curr.val % 2 == 1)
//                         return false;
//                 }
//                 list.add(curr.val);
//                 if (curr.left != null)
//                     q.offer(curr.left);
//                 if (curr.right != null)
//                     q.offer(curr.right);
//             }
//             if (!isvalid(list, even))
//                 return false;
//             even = !even;
//         }
//         return true;
//     }
// }

class Solution {
    public boolean isEvenOddTree(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);

        boolean even = true;

        while (!q.isEmpty()) {
            int size = q.size();

            int prev = even ? Integer.MIN_VALUE : Integer.MAX_VALUE;

            while (size-- > 0) {
                TreeNode curr = q.poll();

                if (even) {
                    
                    if (curr.val % 2 == 0 || curr.val <= prev)
                        return false;
                } else {
                    
                    if (curr.val % 2 == 1 || curr.val >= prev)
                        return false;
                }

                prev = curr.val;

                if (curr.left != null) q.offer(curr.left);
                if (curr.right != null) q.offer(curr.right);
            }

            even = !even;
        }

        return true;
    }
}