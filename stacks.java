//stack class in java implementation
import java.io.*;
import java.util.*;
public class stacks {
    static void stack_push(Stack<Integer> stack)//stack push method to accept the stack
    {
        for(int i=0;i<10;i++){
            stack.push(i);//push inbuilt method
        }
        
    }
static void stack_pop(Stack<Integer> stack)//stack pop method to accept the stack
{
    System.out.println("pop: ");
    for(int i=0; i<10;i++){
        Integer y=(Integer) stack.pop();//pop inbuilt method
        System.out.println(y);
    }
}
static void stack_peek(Stack<Integer> stack)
{
    Integer z=(Integer) stack.peek();//peek method inbuilt
    System.out.println("element at the top : "+ z);
}
static void stack_search(Stack<Integer> stack, int z){//stack search method to accept the stack and the search method
    Integer pos=(Integer) stack.search(z);
    if(pos==-1){
        System.out.println("element not found");
    }
    else{
        System.out.println("element is found on the pos : "+ pos);
    }
}
    public static void main(String[] args) {//main method
        Stack<Integer> stack=new Stack<Integer>();
        stack_push(stack);
        stack_pop(stack);
        stack_push(stack);
        stack_peek(stack);
        stack_search(stack, 2);
    }
}
