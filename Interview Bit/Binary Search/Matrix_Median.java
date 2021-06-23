public class Solution {
    public int findMedian(int[][] A) {
        ArrayList<Integer> list=new ArrayList<Integer>();
        for(int i=0;i<A.length;i++){
            for(int j=0;j<A[i].length;j++){
                list.add(A[i][j]);
            }}
            Collections.sort(list); 
     int n=list.size();
     if(n%2 != 0){
         return(list.get(n/2));
     }
     else if(n==1){
         return (list.get(n));
     }
     else{
     int w=list.get((n-1)/2) ;
     int w1=list.get((n)/2) ;
     return (w+w1)/2;
        }
    }
}
