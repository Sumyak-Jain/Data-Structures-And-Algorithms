/**
Minimize the maximum difference between the heights

Given heights of n towers and a value k. We need to either increase or decrease height of every tower by k (only once) where k > 0. 
The task is to minimize the difference between the heights of the longest and the shortest tower after modifications, 
and output this difference.
**/
class Solution {
    int getMinDiff(int[] arr, int n, int k) {
        // code here
        for(int i=0;i<n;i++){
            if(arr[i]<=k){
                arr[i]=arr[i]+k;
            }
            else if(arr[i]>k){
                arr[i]=arr[i]-k;
            }
        }
        Arrays.sort(arr);
        int j=arr[n-1]-arr[0];
        
        
        return j;
        
        
        
        
    }
}
