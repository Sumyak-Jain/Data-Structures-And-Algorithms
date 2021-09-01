class Solution {
     public static int countSetBits(int n)
    {
 
        // base case
        if (n == 0)
            return 0;
 
        else
 
            // if last bit set add 1 else add 0
            return (n & 1) + countSetBits(n >> 1);
    }
    public int[] countBits(int n) {
     int[] arr=new int[n+1];
     for(int i=0;i<=n;i++){
         
         arr[i]=countSetBits(i);
     }
        return arr;
    }
}
