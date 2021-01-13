/**
Ques:  Union of array

Example:
Input:
5 3
1 2 3 4 5
1 2 3

Output: 
5

Explanation: 
1, 2, 3, 4 and 5 are the
elements which comes in the union set
of both arrays. So count is 5.
**/

// code
public static int doUnion(int a[], int n, int b[], int m) 
    {
       //Creating a new HashSet 
        HashSet<Integer> s=new HashSet<>();
    	    
    	// for each element in the array
    	// insert the element in the set
    	for(int i = 0;i<n;i++)
    	   s.add(a[i]);
    	    
    	 // for each element in another array
    	 // insert the elements in set
    	 // Keep in mind set does not contains duplicates
    	 for(int i = 0;i<m;i++)
    	    s.add(b[i]);
    	    
    	  // now the set contains the elements which are there in both the arrays (distinct elements)
    	  return s.size() ;
    	    
     }
