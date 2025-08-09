// Last updated: 8/9/2025, 6:50:55 PM
class Solution {
    public int maxArea(int[] height) {

        int maxArea = -1;
        int start = 0;
        int end =height.length-1;
        while(start<=end){
            int leftHeight = height[start];
            int rightHeight = height[end];
            int curArea = Math.min(leftHeight, rightHeight) * (end-start);
            maxArea = Math.max(curArea,maxArea);
            if(leftHeight < rightHeight) {
                start++;
            } else {
                end--;
            }

        }
        return maxArea;
        
    }
}