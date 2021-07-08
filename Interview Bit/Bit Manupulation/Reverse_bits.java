
public class Solution {
    public long reverse(long a) {
         long out = 0;


            for(int i  = 0; i < 32; i++) {

                out = out << 1L;
               
                if ((a & 1L) == 1L) {
                        out += 1;
                }

                a = a >>> 1L;

            }

            return out;
    }
}
