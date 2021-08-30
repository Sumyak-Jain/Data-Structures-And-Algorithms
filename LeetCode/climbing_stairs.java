class Solution {
  public int climbStairs(int n) {
	if (n == 1) return 1;

	int[] ways = new int[n+1];
	ways[0] = 1;
	ways[1] = 1;
	for (int i = 2; i <= n; i++) {
		ways[i] = ways[i-1] + ways[i-2];
	}
	return ways[n];
}
}
