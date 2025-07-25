// Last updated: 7/25/2025, 9:08:32 AM
class Solution {
    public int maxSum(int[] nums) {
        // int cur = Integer.MIN_VALUE;
        // int max = Integer.MIN_VALUE;
        // Set<Integer> set = new HashSet<>();
        // for(int i = 0 ; i <nums.length;i++){
        //     int val = nums[i];
        //     if(!set.contains(val)) {
        //         set.add(val);
        //         if(cur==Integer.MIN_VALUE) {
        //             cur=0;
        //         }
        //         cur+=val;
        //         max=Math.max(cur, max);
        //     } else {
        //         cur = 0;
        //         set.clear();
        //     }
        // }
        // return max;

        Set<Integer> set = new HashSet<>();
        int max = Integer.MIN_VALUE;
        for(int i: nums) {
            if(i>0){
                set.add(i);
            } else {
                max = Math.max(max, i);
            }
        }
        
        if(!set.isEmpty()) {
            int maxSum=0;
            for(int i : set) {
                maxSum+=i;
            }
            return maxSum;
        } else {
            return max;
        }

    }
}