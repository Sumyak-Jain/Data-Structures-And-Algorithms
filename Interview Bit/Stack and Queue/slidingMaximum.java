public class Solution {
   
    public ArrayList<Integer> slidingMaximum(final List<Integer> A, int B) {
        Deque<Integer> window = new LinkedList<Integer>();
        ArrayList<Integer> result = new ArrayList<Integer>();
        for (int i = 0; i < A.size(); i++) {
            int val = A.get(i);
            // Remove all elements smaller than the current one from the queue
            while (!window.isEmpty() && val >= A.get(window.getLast())) {
                window.removeLast();
            }
            // Add the current element's index to the queue. It is important that we
            // store the indicies rather than the values.
            window.add(i);
            // The first element of the queue is always the largest. If the index of 
            // this number is smaller than the window's stating index then we remove it
            if (window.getFirst() < (i + 1) - B) {
                window.removeFirst();
            }
          
            if (i >= B - 1)
                result.add(A.get(window.getFirst()));
        }
        return result;
    }
}
