// Last updated: 8/23/2025, 11:14:37 AM
class Solution {
    public int majorityElement(int[] nums) {
        Map<Integer, Integer> frequency = new HashMap<>();
        int element=nums[0];
        int count = 1;
        frequency.put(element, count);
        for(int i = 1 ; i <nums.length;i++) {
            int num = nums[i];
            int tempFrequency = frequency.getOrDefault(num, 0)+1;
            frequency.put(num, tempFrequency);
            if(tempFrequency> count) {
                count = tempFrequency;
                element = num;
            }
        }
        return element;
    }
}