public class Solution {
    public String solve(String A) {
        Set<Character> set = new HashSet<>();
        Queue<Character> deque = new ArrayDeque<>();
        StringBuilder ans = new StringBuilder();
        for (int i = 0; i < A.length(); ++i) {
            char c = A.charAt(i);
            if (set.contains(c)) {
                deque.remove(c);
            }
            else {
                set.add(c);
                deque.add(c);
            }
            if (deque.isEmpty()) {
                ans.append("#");    
            }
            else {
                ans.append(deque.peek());
            }
        }
        return ans.toString();
    }
}
