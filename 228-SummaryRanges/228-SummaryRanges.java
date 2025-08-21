// Last updated: 8/21/2025, 12:43:56 PM
class Solution {

    //[0,1,2,4,5,7]
    /**
        i start end value result
        0 0     0.  0.    0
        1 0.    1.  
        2. 0.    2.  
        3   3    3        0 -> 2
        4   3    4       
        5   5.   5.       3 ->4

     */
    public List<String> summaryRanges(int[] nums) {
        List<String> results = new ArrayList<>();
        if(nums.length==0) {
            
            return results;
        }
        
        if(nums.length==1) {
            results.add(nums[0]+"");
            return results;
        }
        int s=0;
        int end = 0;
        for(int i = 1; i < nums.length;i++) {
            if(nums[i]-nums[i-1]==1) {
                end++;
            } else {
                if(s!=end) {
                    results.add(nums[s]+"->"+nums[end]);
                } else {
                    results.add(nums[s]+"");
                }
                s=end=i;
                
            }
            
        }
        if(s!=end) {
            results.add(nums[s]+"->"+nums[end]);
        } else {
            results.add(nums[s]+"");
        }
        
        return results;
    }
}