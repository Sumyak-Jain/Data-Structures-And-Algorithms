class Solution {
    
    public int numSquares(int n) {        
        int[] dp = new int[n+1];        
        dp[1] = 1;
        
        for(int i = 2; i<=n ;i++){
            dp[i] = dp[i-1]+1;
            for(int j = 1; j <= Math.sqrt(i); j++){                                
                if(i-j*j>=0){
                    dp[i] = Math.min(dp[i], dp[i-j*j] +1);
                }
            }
        }
        
        return dp[n];
    }
    
}
