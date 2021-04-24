// Smallest subarray with sum greater than x 
int sb(int arr[], int n, int x)
    {
        // Your code goes here   
          // Initialize current sum and minimum length
        int curr_sum = 0, min_len = n+1;
     
        // Initialize starting and ending indexes
        int start = 0, end = 0;
        while (end < n)
        {
            // Keep adding array elements while current sum
            // is smaller than x
            while (curr_sum <= x && end < n)
                curr_sum += arr[end++];
     
            // If current sum becomes greater than x.
            while (curr_sum > x && start < n)
            {
                // Update minimum length if needed
                if (end - start < min_len)
                    min_len = end - start;
     
                curr_sum -= arr[start++];
            }
        }
        
    	if(min_len>n)
    	return 0;
        return min_len;
    }
