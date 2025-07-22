// Last updated: 7/22/2025, 11:48:42 PM
class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] output = {0,0};
        int count = 0;
        int internalCount = 0;
        while(internalCount <nums.length){
            if(count != internalCount){
                int a = target - nums[count];
                if(a == nums[internalCount]){
                    output[0] = count;
                    output[1] = internalCount;
                    break;
                }
            }
            if(internalCount == nums.length -1){
                count++;
                internalCount = count;
            } else{
                internalCount++;
            }
            
        }
        return output;
        
    }
}