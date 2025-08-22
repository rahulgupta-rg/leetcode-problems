// Last updated: 8/22/2025, 9:31:51 AM
class Solution {
    public int removeDuplicates(int[] nums) {

        int index = 2; 
        for(int j = 2 ; j < nums.length ; j++) {
            
            if(nums[j]!=nums[index-2]) {
                nums[index] = nums[j];
                index++;
            }
        }
        return index;

    }
}