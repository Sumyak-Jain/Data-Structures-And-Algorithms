class Solution {
public TreeNode sortedArrayToBST(int[] nums) {
		int mid = nums.length / 2;
		TreeNode root = new TreeNode(nums[mid]);
		root = populateTree(nums, 0, nums.length - 1, root);
		
		return root;
	}

	private TreeNode populateTree(int[] nums, int begin, int end, TreeNode root) {
		if (begin > end) {
			return null;
		}
		int mid = begin + (end - begin) / 2;
		TreeNode node = new TreeNode(nums[mid]);
		node.left = populateTree(nums, begin, mid - 1, root);
		node.right = populateTree(nums, mid + 1, end, root);
		return node;
	}
    
}
