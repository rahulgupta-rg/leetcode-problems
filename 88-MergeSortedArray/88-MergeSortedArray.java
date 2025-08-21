// Last updated: 8/21/2025, 6:31:18 PM
class Solution {
    
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        
        //1,4,5,6,7,8
        //4,5,6

        // 1,4,5,6,7,8
        // 4,5,6

        // 4,5,6,0,0,0
        // 1,2,3

        // 1,2,3,4,5,6
        // 1,2,3

        // 1,5,0,0
        // 2,7,9,10

        // 1,2,5,5
        // 2,7,9,10

        // O(m) + O(m)+O(n)

        int i = m-1;
        int j = n-1;
        int k = m+n-1;
        while(j>=0){
            if(i >= 0 && nums1[i]>=nums2[j]){
                nums1[k]=nums1[i];
                i--;
                k--;
            } else {
                nums1[k]=nums2[j];
                j--;
                k--;
            }
        }

    }
    
    // public void merge(int[] nums1, int m, int[] nums2, int n) {
    //     int[] arr = new int[m+n];
    //     int i = 0;
    //     int left = 0;
    //     int right = 0;
    //     while (left <m || right <n ) {
    //         if(nums1[left]<=nums2[n]) {
    //             arr[i]=nums1[left];
    //             left++;
    //         } else {
    //             arr[i]=nums2[right];
    //             right++;
    //         }
    //         i++;
    //     }
    //     if(left < m && right==n-1) {
    //         for(int j = left ; j<m;j++) {
    //             arr[j] = nums1[left++];
    //         }
    //     } else if(right < n && left==m-1) {
    //         for(int j = right ; j<n;j++) {
    //             arr[j] = nums2[right++];
    //         }
    //     }

    // }
}