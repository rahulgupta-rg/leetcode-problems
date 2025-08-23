// Last updated: 8/23/2025, 10:13:40 AM
class Solution {
    public void rotate(int[] nums, int k) {
        //1,2,3,4,5,6,7
        //3,4,5,6,7,1,2
        
        //3,2,1,4,5,6,7
        //3,4,1,2,5,6,7
        //3,4,5,2,1,6,7
        //3,4,5,6,1,2,7
        //3,4,5,6,7,2,1
        
        //1,2,3,4,5,6,7, 8
        //4,5,6,1,2,3,7,8
        //4,5,6,7,8,3,1,2
        // if (nums.length == 0){
        //     return;
        // }
        // if (nums.length == 1){
        //     return;
        // }
        // if (nums.length < k) {
        //     return;
        // }
        k = k % nums.length;
        reverse(0, nums.length-1, nums);
        reverse(0, k-1, nums);
        reverse(k, nums.length-1, nums);
        
        
    }

    public void reverse(int start , int end, int[] n) {
       while(start < end){
            int temp = n[end];
            n[end] = n[start];
            n[start] = temp;
           start++;
           end--;
        }
    }
}