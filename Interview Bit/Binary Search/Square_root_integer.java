// first
public class Solution {
    public int sqrt(int num) {
        
         int strt= 1 ,end=num/2 ,prev= -1 ,res= -1 ;
    if(num == 0) {
        return 0 ;
    }if(num == 1) {
        return 1 ;
    }
    end= Math.min(end ,46340) ; // 46340 is the sqrt of Integer.MAX_VALUE
    while(strt <= end) {
        int mid = strt + (end - strt)/2 ;
        if((long)(mid*mid) == (long)num) {
            return mid ;
        }if((long)(mid*mid) < (long)num) {
            res= mid ;
            strt= mid+1 ;
        }else {
            end= mid-1 ;
        }
    }
    return res ;
    }
}

//second
public class Solution {
   public int sqrt(int a) {
	    long low = 1;
	    long high = a;
	    while (low<=high) {
	        long mid = (high + low) / 2;
	        if (mid*mid == a) {
	            return (int) mid;
	        }
	        if (mid*mid > a) {
	            high = mid - 1;
	        } else {
	            low = mid + 1;
	        }
	    }
	    // if we did not find an exact match the high variable is smaller than low
	    // and therefore contains the floor value of sqrt.
	    return (int) high;
	}
}
