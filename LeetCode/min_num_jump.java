
class Solution {
    public int jump(int[] nums) {
        if(nums.length==0 || nums.length==1) return 0;

        int jump = 1;
        int count =nums[0];
        int p_max = nums[0];

        for(int i =1;i<nums.length;i++){

            if(count==0){
                jump +=1;
                count = p_max;
            }else p_max -=1;
            
            if(p_max<=nums[i])
                p_max = nums[i];
                count = count-1;
        }
        return jump;
    }
}
