import java.util.*;
public class Solution {
    public int solve(String A) {
           Deque<Character> stack
            = new ArrayDeque<Character>();
 
        // Traversing the Expression
        for (int i = 0; i < A.length(); i++)
        {
            char x = A.charAt(i);
 
            if (x == '(' || x == '[' || x == '{')
            {
                // Push the element in the stack
                stack.push(x);
                continue;
            }
 
            // If current character is not opening
            // bracket, then it must be closing. So stack
            // cannot be empty at this point.
            if (stack.isEmpty())
                return 0;
            char check;
            switch (x) {
            case ')':
                check = stack.pop();
                if (check == '{' || check == '[')
                    return 0;
                break;
 
            case '}':
                check = stack.pop();
                if (check == '(' || check == '[')
                    return 0;
                break;
 
            case ']':
                check = stack.pop();
                if (check == '(' || check == '{')
                    return 0;
                break;
            }
        }
 
        // Check Empty Stack
        if(stack.isEmpty()){
            return 1;
        }
        else{
            return 0;
        }
       
        
    }
}
