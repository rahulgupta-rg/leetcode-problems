// Last updated: 8/11/2025, 10:13:17 PM
class Solution {
    /*public int rob(int[] nums) {
        int firstSum = 0;
        int secondSum = 0;
        int start = 0;
        int end = 1;
        if(nums.length==0)
            return 0;
        if(nums.length==1)
            return nums[0];
        
        if(nums.length==2)
            return Math.max(nums[0], nums[1]);


        int endValueForStart = -1;
        int endValueForEnd = -1;
        if(nums.length %2==0) {
            endValueForStart = nums.length-2;
            endValueForEnd = nums.length-1;
        } else {
            endValueForStart = nums.length-1;
            endValueForEnd = nums.length-2;
        }
            
        while(start<=endValueForStart && end <= endValueForEnd) {
            firstSum += nums[start];
            secondSum += nums[end];
            start = start+2;
            end = end+2;
        }
        return Math.max(firstSum, secondSum);
    }
    */

    public int rob(int[] nums) {
        int[] dp = new int[nums.length];
        Arrays.fill(dp,-1);
        return findSum(0,nums, dp);
    }

    int findSum(int index, int[] nums, int[] dp) {
        if(index>=nums.length)
        {
            return 0;
        }
        if(dp[index]!=-1) {
            return dp[index];
        }        
        int pick = nums[index]+findSum(index+2, nums, dp);
        int notPick = findSum(index+1, nums, dp);
        dp[index] =  Math.max(pick,notPick);
        return dp[index];
    }
}