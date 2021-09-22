class Solution {
    public int sumOfLeftLeaves(TreeNode root) {
        if (root == null) 
            return 0;
        
        if (root.left != null && isLeaf(root.left)) {
            return root.left.val + sumOfLeftLeaves(root.right);
        } else {
            return sumOfLeftLeaves(root.left) + sumOfLeftLeaves(root.right);
        }
    }
    
    private boolean isLeaf(TreeNode node) {
        return node.left == null && node.right == null;
    }
}
