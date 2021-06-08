/*
Input: A = 4.
Output:

4 4 4 4 4 4 4 
4 3 3 3 3 3 4 
4 3 2 2 2 3 4 
4 3 2 1 2 3 4 
4 3 2 2 2 3 4 
4 3 3 3 3 3 4 
4 4 4 4 4 4 4 

*/


public class Solution {
    public int[][] prettyPrint(int A) {
        int n=(2*A)-1;
        int arr[][] = new int[n][n];
          for(int R = 0; R<A; R++){
        for(int i = R; i<n-R; i++){
            arr[R][i] = A-R;
            arr[n-R-1][i] = A-R;
            arr[i][R] = A-R;
            arr[i][n-R-1] = A-R;
        }
    }
       return arr; 
    }
}
