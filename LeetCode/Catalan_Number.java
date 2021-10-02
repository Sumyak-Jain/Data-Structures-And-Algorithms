/**
Catalan numbers are a sequence of natural numbers that occurs in many interesting counting problems like following.

1)Count the number of expressions containing n pairs of parentheses which are correctly matched. For n = 3, possible expressions are ((())), ()(()), ()()(), (())(), (()()).
2)Count the number of possible Binary Search Trees with n keys (See this)
3)Count the number of full binary trees (A rooted binary tree is full if every vertex has either two children or no children) with n+1 leaves.
4)Given a number n, return the number of ways you can draw n chords in a circle with 2 x n points such that no 2 chords intersect.

**/

class Solution {
    public int numTrees(int n) {
       int catlan[] = new int[n + 2];
 
        // Initialize first two values in table
        catlan[0] = 1;
        catlan[1] = 1;
 
        // Fill entries in catalan[]
        // using recursive formula
        for (int i = 2; i <= n; i++) {
            catlan[i] = 0;
            for (int j = 0; j < i; j++) {
                catlan[i] += catlan[j] * catlan[i - j - 1];
            }
        }
 
        // Return last entry
        return catlan[n];
    }
}
