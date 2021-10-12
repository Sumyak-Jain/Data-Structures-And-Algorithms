class Solution {
    public List<String> binaryTreePaths(TreeNode root) {
        
        List<String>res = new ArrayList<>();
        fillPaths(root,"",res);
        return res;
    }
    
  
   //additional helper function 
   public void fillPaths(TreeNode node,String str,List<String> res)
    {
        if (node == null)
            return;
        
        if(node.left == null && node.right == null)
        {
            res.add(str+node.val); 
            return;
        }
          fillPaths(node.left, str+node.val+"->", res); 
          fillPaths(node.right, str+node.val+"->", res); 
    }
}
