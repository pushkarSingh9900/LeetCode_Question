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
    ArrayList<Integer> list;
    public int kthSmallest(TreeNode root, int k) {
        list = new ArrayList<>();
        inOrder(root, list);
        return list.get(k-1);

    }
    public void inOrder(TreeNode root, ArrayList<Integer>list){
        if(root == null) return;

        inOrder(root.left,list);
        list.add(root.val);
        inOrder(root.right,list);
    }
}