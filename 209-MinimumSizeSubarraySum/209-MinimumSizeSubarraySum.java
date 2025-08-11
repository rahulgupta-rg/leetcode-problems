// Last updated: 8/11/2025, 11:05:00 PM
class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int start = 0;
        int minLen = Integer.MAX_VALUE;
        int sum = 0;
        
        for(int i = 0; i < nums.length ; i++) {
            sum+=nums[i];
            while(sum>=target){
                minLen = Math.min(minLen, i-start+1);
                sum-=nums[start];
                start++;
            }
        }
        return minLen==Integer.MAX_VALUE ? 0 : minLen;
    }
}