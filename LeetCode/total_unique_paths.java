class Solution {
    int[][] seen;
    public int uniquePaths(int m, int n) {
        seen = new int[m][n];
        return recurse(m-1, n-1);
    }
    public int recurse(int m, int n){
        if(m == 0 || n == 0){
            return 1;
        }
        if(seen[m][n] != 0){
            return seen[m][n];
        }
        int res = recurse(m, n - 1) + recurse(m - 1, n);
        seen[m][n] = res;
        return res;
    }
}
