class Solution {
    public int singleNumber(int[] nums) {
        int digit =0;
              
        for(int i=0;i<nums.length;i++) {
            digit ^= nums[i];
        }
        return digit;
        
    }
}
