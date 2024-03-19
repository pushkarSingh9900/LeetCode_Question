class Solution {
    public int climbStairs(int n) {
      int[] dp = new int[n+1];
      for(int i = 0; i<=n; i++){
        if(i <= 3){
            dp[i] = i;
        }else{
            dp[i] = dp[i-2] + dp[i-1];
        }
      }  
      return dp[n];
    }
}
