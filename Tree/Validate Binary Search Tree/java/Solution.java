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
    public boolean isValidBST(TreeNode root) {
        if(root.left==null&&root.right==null) return true;
        boolean b=false;
        if(root.left!=null&&root.left.val<root.val) {
             isValidBST(root.left); 
             b=true;
        }
        else b=false;
        if(root.right!=null&&root.right.val>root.val){
             isValidBST(root.right); 
             b=true;
        }  
        else b=false;     
        return b;
        

        
    }
}