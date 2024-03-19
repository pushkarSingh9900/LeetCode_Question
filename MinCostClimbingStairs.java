class Solution {
    public int minCostClimbingStairs(int[] cost) {
       int[] dp = new int[cost.length];
       for(int i = 0; i<cost.length; i++){
            if(i <= 1){
                dp[i] = cost[i]; 
            }else{
                dp[i] = Math.min(dp[i-1], dp[i-2]) + cost[i];
            }
       } 
       return Math.min(dp[cost.length - 1], dp[cost.length - 2]);
    }
}
