import java.util.*;

class MyQueue {
    Stack<Integer> input=new Stack<>();
    Stack<Integer> output=new Stack<>();
    public void push(int x) {
        while (!input.isEmpty()) {
            output.push(input.pop());
        }
        input.push(x);
        while (!output.isEmpty()) {
            input.push(output.pop());
        }
    }
    public int pop() {
        return input.pop();
    }
    public int peek() {
        return input.peek();
    }
    public boolean empty() {
        return input.isEmpty();
    }
}
public class Bruteforce {
    
}
