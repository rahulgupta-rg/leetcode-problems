// Last updated: 8/17/2025, 11:32:38 PM
class Solution {
    // public int climbStairs(int n) {

    //     return ways(1, n);
    // }

    // int ways(int i , int n) {
    //     if(i>=n)
    //         return 1;
    //     int wayWith1Step = ways(i+1,n);
    //     int wayWith2Step = ways(i+2,n);
    //     return wayWith1Step+wayWith2Step;
    // }
    public int climbStairs(int n) {
        int[] dp = new int[n+1];
        Arrays.fill(dp,-1);
        return ways(1,n,dp);   
    }
    private int ways(int i , int n, int[] dp) {
        if(i>=n) {
            dp[n]=1;
            return 1;
        }
        if(dp[i]!=-1){
            return dp[i];
        }
        int ways1 = ways(i+1,n,dp);
        int ways2 = ways(i+2,n,dp);
        dp[i]=ways1+ways2;
        return dp[i];
   }
}