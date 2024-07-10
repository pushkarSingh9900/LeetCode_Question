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
    public int diameterOfBinaryTree(TreeNode root) {
        int[] d = new int[1];
        dbt(root , d);
        return d[0];
    }
    int dbt(TreeNode root, int[] diameter){
        if(root==null)return 0;
        int lH = dbt(root.left, diameter);
        int rH = dbt(root.right, diameter);
        diameter[0] = Math.max(diameter[0], lH+rH);
        return Math.max(lH,rH)+1;
    }
}
