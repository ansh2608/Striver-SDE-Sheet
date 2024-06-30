import java.util.*;

class MyQueue {
    Stack<Integer> input=new Stack<>();
    Stack<Integer> output=new Stack<>();
    public void push(int x) {
        input.push(x);
    }
    public int pop() {
        while (input.size()>1) output.push(input.pop());
        int x=input.pop();
        while (output.size()>0) input.push(output.pop());
        return x;
    }
    public int peek() {
        while (input.size()>1) output.push(input.pop());
        int x=input.peek();
        while (output.size()>0) input.push(output.pop());
        return x;
    }
    public boolean empty() {
        if (input.size()==0) return true;
        else return false;
    }
}
public class Best {
    
}
