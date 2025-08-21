// Last updated: 8/22/2025, 12:08:47 AM
class Solution {
    public int removeDuplicates(int[] nums) {
        int index = 0;
        //[1,1,2]
        int count = 0;
        for(int i =0 ; i< nums.length;i++) {
            if(nums[i]!=nums[index]) {
                nums[index+1]=nums[i];
                index++;
            } else {
                count++;
            }
        }
        return index+1;
    }
}