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
    int sum=0;
    public TreeNode convertBST(TreeNode root) {
        TreeNode dummy=root;
        BST(root);
        return dummy;
    }
    void BST(TreeNode root){
        if(root==null) return;
        BST(root.right);
        sum+=root.val;
        root.val=sum;
        BST(root.left);
    }
}