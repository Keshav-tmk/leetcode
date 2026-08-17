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
    Map<TreeNode,TreeNode> map=new HashMap<>();
    public void buildparent(TreeNode root,TreeNode par){
        if(root==null)return ;
        map.put(root,par);

        buildparent(root.left,root);
        buildparent(root.right,root);
    }
    public List<Integer> distanceK(TreeNode root, TreeNode target, int k) {
           List<Integer> ans=new ArrayList<>();
           
        buildparent(root,null);

        Set<TreeNode> set=new HashSet<>();
        Queue<TreeNode> q=new LinkedList<>();

        set.add(target);
        q.offer(target);
        int dis=0;
        while(!q.isEmpty()){
            if(k==dis)break;
            int n=q.size();

            for(int i=0;i<n;i++){
            TreeNode curr=q.poll();
            if(curr.left!=null &&!set.contains(curr.left)){
                q.offer(curr.left);
                set.add(curr.left);

            }
            if(curr.right!=null &&!set.contains(curr.right)){
                q.offer(curr.right);
                set.add(curr.right);

            }
            if(map.get(curr)!=null && !set.contains(map.get(curr))){
                q.offer(map.get(curr));
                set.add(map.get(curr));
            }}
            dis++;
        }
     

        while(!q.isEmpty())ans.add(q.poll().val);

return ans;
    }
}