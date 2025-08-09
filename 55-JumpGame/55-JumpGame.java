// Last updated: 8/9/2025, 10:16:10 AM
class Solution {
//[2,3,1,1,4] //[3,2,1,0,4] //2,0,0
    public boolean canJump(int[] arr) {
        if(arr.length==1){
            return true;
        }
        int farthest = 0;
        for(int i = 0;i<arr.length;i++) {
            if(i>farthest) {
                return false;
            }
            
            farthest = Math.max(arr[i]+i, farthest);
            // if(farthest >= arr.length) {
            //     return true;
            // }
           
        }
        return true;
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