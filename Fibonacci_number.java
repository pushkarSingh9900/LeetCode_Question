class Solution {
    Integer[] memo;
    public int fib(int n) {
        memo = new Integer[n+1];
        return fibHelp(n);
    }
    public int fibHelp(int n){
        if(n<=1) return n;
        if(memo[n] != null) return memo[n];
        memo[n] = fibHelp(n-1)+fibHelp(n-2);
        return memo[n];
    }
}
