public class Solution {
	// DO NOT MODIFY BOTH THE LISTS
	public double findMedianSortedArrays(final List<Integer> a, final List<Integer> b) {
	    
	 ArrayList<Integer> list=new ArrayList<Integer>();
     list.addAll(a);
     list.addAll(b);
     Collections.sort(list); 
     int n=list.size();
     if(n%2 != 0){
         return(list.get(n/2));
     }
     else if(n==1){
         return (list.get(n));
     }
     else{
     double w=list.get((n-1)/2) ;
     double w1=list.get((n)/2) ;
     return (w+w1)/2;
     
     }
	}
}
