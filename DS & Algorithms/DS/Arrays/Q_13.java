//Array Subset of another array
class Compute {
    public String isSubset( long a1[], long a2[], long n, long m) {
          int i = 0;
        int j = 0;
        for ( i = 0; i < m; i++) {
            for (j = 0; j < n; j++)
                if (a2[i] == a1[j])
                    break;
 
            if (j == n)
                return "No";
        }
 
       
        return "Yes";
    
        
    }
}
