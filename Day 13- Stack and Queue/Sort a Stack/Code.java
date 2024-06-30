import java.util.*;
public class Code {
    public static void sortedInsert(Stack<Integer> stack, int current) {
		if (stack.empty() == true || current > stack.peek()) {
			stack.push(current);
			return;
		}
		int top = stack.peek();
		stack.pop();
		sortedInsert(stack, current);
		stack.push(top);
	}
	public static void sortStack(Stack<Integer> stack) {
		if (stack.empty() == true) return;
		int top = stack.peek();
		stack.pop();
		sortStack(stack);
		sortedInsert(stack, top);
	}
    public static void main(String[] args) {
        System.out.println("hi");
    }
}
