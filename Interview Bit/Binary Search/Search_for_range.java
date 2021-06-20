public class Solution {
    public ArrayList<Integer> searchRange(final List<Integer> A, int B) {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        for(int i=0;i<A.size();i++){
            if(A.get(i)==B){
                arr.add(i);
            }
        }
          ArrayList<Integer> arr1 = new ArrayList<Integer>();
          if(arr.size()==0){
              arr1.add(-1);
               arr1.add(-1);
              
          }
          else{
          arr1.add(arr.get(0));
          arr1.add(arr.get(arr.size()-1));}
          return arr1;
    }
}
