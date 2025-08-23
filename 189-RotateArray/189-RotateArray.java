// Last updated: 8/23/2025, 11:24:07 AM
class Solution {
    public int majorityElement(int[] nums) {
                Map<Integer, Integer> count = new HashMap<>();

        for (int num : nums) {
            count.putIfAbsent(num, 0);
            count.put(num, count.get(num) + 1);

            if (count.get(num) > nums.length / 2) {
                return num;
            }
        }

        return 0;
    }
}