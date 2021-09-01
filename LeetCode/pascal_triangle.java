class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        
        for(int i = 0; i < numRows; i++) {
            
            List<Integer> nums = new ArrayList<>();
            for(int j = 0; j <= i; j++) {
                if(j == 0 || j == i) {
                    nums.add(1);
                } else {
                    int n = result.get(i - 1).get(j - 1) + result.get(i - 1).get(j);
                    nums.add(n);
                }
            }
            
            result.add(nums);
        }
        
        return result;
    }
}
