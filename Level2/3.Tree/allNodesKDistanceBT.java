///863. All Nodes Distance K in Binary Tree
import java.util.ArrayList;
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;s
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public class TreeNode {
            int val;
            TreeNode left;
            TreeNode right;
            TreeNode(int x) { val = x; }
        }
    public ArrayList<TreeNode> nodeToRootPath(TreeNode root, int target){
        if(root.val == target){
            ArrayList<TreeNode> base = new ArrayList<>();
            base.add(root);
            return base;
        }
        
        if(root.left != null){
            ArrayList<TreeNode> left = nodeToRootPath(root.left , target);
            if(left.size() > 0){
                left.add(root);
                return left;
            }
        }
        
        if(root.right != null){
            ArrayList<TreeNode> right = nodeToRootPath(root.right,target);
            if(right.size() > 0){
                right.add(root);
                return right;
            }
        }
        
        return new ArrayList<TreeNode>();
    }
    
    public static void printKLevelDown(TreeNode curr , TreeNode prev , int k , ArrayList<Integer> ans){
        if(curr == null) return;
        if(curr == prev) return;
        if(k == 0) {
            ans.add(curr.val);
            return;
        }
        printKLevelDown(curr.left , prev , k-1 , ans);
        printKLevelDown(curr.right , prev, k-1 , ans);
        
    }
    public ArrayList<Integer> distanceK(TreeNode root, TreeNode target, int k) {
        
        ArrayList<TreeNode> path = nodeToRootPath(root, target.val);
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i = 0 ; i < path.size(); i++){
            TreeNode curr = path.get(i);
            TreeNode prev = null;
            if(i != 0 ){
                prev = path.get(i-1);
            }
            printKLevelDown(curr , prev, k, ans);
            k--;
        }
            
        return ans;        
    }
}