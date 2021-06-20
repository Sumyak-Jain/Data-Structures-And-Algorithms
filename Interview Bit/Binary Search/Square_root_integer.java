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
