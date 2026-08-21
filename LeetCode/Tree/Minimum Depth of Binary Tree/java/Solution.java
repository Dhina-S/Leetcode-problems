class Solution {
    public int minDepth(TreeNode root) {
        if(root==null)return 0;
        int ll=minDepth(root.left);
        int rl=minDepth(root.right);
        return (ll == 0 || rl == 0) ? ll + rl + 1: Math.min(ll,rl) + 1;
    }
}
