/**
Kadane’s Algorithm:
find Largest sum contiguous Subarray 

Example 1:
Input:
N = 5
arr[] = {1,2,3,-2,5}
Output:
9
Explanation:
Max subarray sum is 9
of elements (1, 2, 3, -2, 5) which 
is a contiguous subarray.

Example 2:
Input:
N = 4
arr[] = {-1,-2,-3,-4}
Output:
-1
Explanation:
Max subarray sum is -1 
of element (-1)
**/

//CODE
int maxSubarraySum(int arr[], int n){
       int max_so_far=0; 
       int max_end_here=0;
       for(int i=0;i<n;i++){
           max_end_here=max_end_here+arr[i];
           if(max_end_here<0){
               max_end_here=0;
              
           }
           else if (max_so_far<max_end_here){
               max_so_far=max_end_here;
           }
       }
        return max_so_far;
    }
