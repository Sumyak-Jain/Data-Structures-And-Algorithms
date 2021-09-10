 */
class Solution {
    public int getDecimalValue(ListNode head) {
        int sum = 0; // Intialise sum
        
        while(head != null){ // Run the loop until head not point at null
            sum *= 2; // sum<<1 
            sum += head.val;
            head = head.next;
        }
        
        return sum;
    }
}
