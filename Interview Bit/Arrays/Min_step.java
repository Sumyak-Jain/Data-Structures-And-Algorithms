public class Solution {
    public int coverPoints(ArrayList<Integer> A, ArrayList<Integer> B) {
        int c=0;
        for(int i=1;i<A.size();i++){
            int x = Math.abs(A.get(i)-A.get(i-1));
            int y = Math.abs(B.get(i)-B.get(i-1));
            
            c = c + Math.abs(x-y);
            c= c + (x>y?y:x);
            
        }
        
        return c;
        
    }
}
