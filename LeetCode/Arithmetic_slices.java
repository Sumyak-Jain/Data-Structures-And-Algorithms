class Solution {
    public int numberOfArithmeticSlices(int[] nums) {
        int count = 0, sum = 0;
        for(int i = 1; i < nums.length - 1; i++) {
            if(nums[i] - nums[i - 1] == nums[i + 1] - nums[i])
                sum += ++count;
            else
                count = 0;
        }
        return sum;
    }
}
