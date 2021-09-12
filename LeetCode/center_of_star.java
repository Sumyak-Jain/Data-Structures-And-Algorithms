class Solution {
    public int findCenter(int[][] edges) {
          int a= edges[0][0];
          int b=edges[0][1];
          int c=edges[1][0];
          int d=edges[1][1];
          int result=0;
          if(a==c||a==d){
              result=a;
          }
          if(b==c || b==d){
              result=b;
          }
          return result;
        }
    
    }
