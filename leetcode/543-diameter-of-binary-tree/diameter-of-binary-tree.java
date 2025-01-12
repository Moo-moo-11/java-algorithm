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

    int longest = 0;

    int dfs(TreeNode node) {

        if (node == null) {
            return -1;
        }
        
        int left = dfs(node.left);
        int right = dfs(node.right);

        this.longest = Math.max(this.longest, left + right + 2);
        return Math.max(left, right) + 1;
    }

    public int diameterOfBinaryTree(TreeNode root) {
        dfs(root);
        return longest;
    }
}