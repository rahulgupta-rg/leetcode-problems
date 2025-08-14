// Last updated: 8/14/2025, 5:08:15 PM
class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer, Integer> visited = new HashMap<>();
        for(int i = 0 ; i<nums.length;i++) {
            int num = nums[i];
            if(visited.containsKey(num)) {
                int prevIndex = visited.get(num);
                if(i-prevIndex<=k){
                    return true;
                }else {
                    visited.put(num, i);
                }
            }else {
                visited.put(num, i);
            }
        }
        return false;   
    }
}