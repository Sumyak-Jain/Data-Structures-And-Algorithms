class Solution {
    public int rob(TreeNode root) {
        if (root == null) {
            return 0;
        }
        
        int rob = root.val;
        
        int noRob = rob(root.left) + rob(root.right);
        
        if (root.left != null) {
            if (root.left.left != null) {
                rob += root.left.left.val;
            }

            if (root.left.right != null) {
                rob += root.left.right.val;
            }
        }
        
        if (root.right != null) {
            if (root.right.left != null) {
                rob += root.right.left.val;
            }
            if (root.right.right != null) {
                rob += root.right.right.val;
            }
        }
        
        root.val = Math.max(rob, noRob);
        
        return root.val;
    }
}
