//solution 1

class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] arr=new int[2];
        for(int i=0;i<nums.length-1;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]+nums[j]==target){
                    arr[0]=i;
                    arr[1]=j;
                    break;}
            }
        }
        return arr;
    }
}


// solution 2
 class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int var = target - nums[i];
            if (map.containsKey(var)) {
                return new int[] {map.get(var), i};
            }
            map.put(nums[i], i);
        }
        throw new IllegalArgumentException("There is no solution for these inputs");
    }
