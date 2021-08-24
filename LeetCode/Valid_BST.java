//METHOD-1 (0 ms)
class Solution {
public int isValidBST(TreeNode A) {
if (A == null) return 1;

    if(dfs(A, null, null)==true)
      return 1;
    else
     return 0;
}
public boolean dfs(TreeNode root, Integer min, Integer max){
    if(root == null) return true;
    
    if((max != null && root.val >= max) || (min != null && root.val <= min)){
        return false;
    }
    return dfs(root.left, min, root.val) && dfs(root.right, root.val, max);
}
}


//METHOD-2 (5 ms)
public class Solution {
    List<Integer> list=new ArrayList<Integer>();
    
    public boolean isValidBST(TreeNode A) {
        List<Integer> list1=new ArrayList<Integer>();
        list1=inorder(A);
        boolean ans=true;
        System.out.println(list1);
        for(int i=0;i<list1.size();i++){
            if(i==list1.size()-1){
                break;
            }
            if(list1.get(i+1)<=list1.get(i)){
                ans=false;
                break;
            }
        }
        return ans;
     
    }
    
    public List<Integer> inorder(TreeNode root){
        if(root!=null){
            inorder(root.left);
            list.add(root.val);
            inorder(root.right);
        }
        return list;
    }
}
