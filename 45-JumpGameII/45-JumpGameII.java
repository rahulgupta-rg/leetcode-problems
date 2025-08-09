// Last updated: 8/9/2025, 6:25:33 PM
class Solution {
    public int jump(int[] nums) {

        if (nums == null || nums.length <= 1) 
            return 0;

        int jumps = 0;
        int end = 0;       // end of current window (reachable with current jumps)
        int farthest = 0;  // farthest reachable by taking one more jump from current window

        for (int i = 0; i < nums.length - 1; i++) {
            farthest = Math.max(farthest, i + nums[i]);

            // when we reach the end of the current window, we must make a jump
            if (i == end) {
                jumps++;
                end = farthest;
                // optional: early exit if already can reach or exceed last index
                if (end >= nums.length - 1) 
                    break;
            }
        }

        return jumps;
        
    }

    // public boolean canJump(int[] arr) {
    //     return helper(0,arr);
    // }

    // boolean helper(int index , int[] arr) {
    //     if(index==arr.length-1) {
    //         return true;
    //     }
    //     if(index>arr.length-1)
    //     {
    //         return false;
    //     }
    //     for(int i = index;i<=arr[index];i++) {
    //         boolean result = helper(index+i,arr );
    //         if(result){
    //             return true;
    //         }
    //     }
    //     return false;
    // }
}