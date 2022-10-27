/// 114. Flatten Binary Tree to Linked List
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
    public class TreeNode {
            int val;
            TreeNode left;
            TreeNode right;
            TreeNode() {}
            TreeNode(int val) { this.val = val; }
            TreeNode(int val, TreeNode left, TreeNode right) {
                this.val = val;
                this.left = left;
                this.right = right;
            }
        }
    private TreeNode childTail(TreeNode root){
        if(root == null) return null;
        while(root.right != null){
            root = root.right;
        }
        return root;
    }
    public void flatten(TreeNode root) {
        if(root == null) return;
        flatten(root.left);
        flatten(root.right);
        
        if(root.left != null){
            TreeNode lchild = root.left;
            TreeNode rchild = root.right;
            TreeNode tailLChild = childTail(lchild);
            
            root.right = lchild;
            tailLChild.right = rchild;
            root.left = null;
        }
    }
}