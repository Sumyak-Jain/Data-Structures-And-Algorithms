public class Solution {
    public int kthsmallest(final List<Integer> A, int B) {
        Collections.sort(A);
        int a=A.get(B-1);
        return a;
    }
}
