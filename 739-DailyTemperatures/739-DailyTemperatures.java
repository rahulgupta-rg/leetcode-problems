// Last updated: 8/11/2025, 7:24:02 PM
class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int[] output = new int[temperatures.length];
        Stack<Integer> stack = new Stack<>();
        for(int i = 0 ; i < temperatures.length;i++) {

            while(!stack.isEmpty() && temperatures[i] > temperatures[stack.peek()]) {
                int index = stack.pop();
                output[index] = i - index;
            }
            stack.push(i);
        }
        return output;
    }
}