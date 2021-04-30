//Row with max 1s
class Solution {
    int rowWithMax1s(int arr[][], int n, int m) {
      
        int total=0;
        int ans=-1;
        for(int i=0;i<n;i++){
              int count1=0;
            for(int j=0;j<m;j++){
                if(arr[i][j]==1){
                    count1=count1+1;
                }
            }
            if(count1>total){
                total=count1;
                ans=i;
            }
            
          
        }
        
        
        return ans;
    }
}
