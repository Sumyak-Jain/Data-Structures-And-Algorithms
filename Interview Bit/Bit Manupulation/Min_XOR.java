public class Solution {
    public int findMinXor(ArrayList<Integer> A) {
         Collections.sort(A);
    int min= A.get(0)^A.get(1);
    for(int i=1;i<A.size()-1;i++)
    {
           int num =A.get(i)^A.get(i+1);
           if(num<min){
               min=num;
           }
           
        
    }
    return min;
    }
}
