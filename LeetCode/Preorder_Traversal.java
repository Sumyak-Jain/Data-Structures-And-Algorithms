class Solution {
     List<Integer> list=new ArrayList<Integer>();
    public List<Integer> preorderTraversal(TreeNode root) {
        if(root!=null){
            list.add(root.val);
            preorderTraversal(root.left);
             preorderTraversal(root.right);
        }
        
        return list;
    }
}
