import java.util.Stack;

public class PeekMethodExample {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("Top of the stack: " + peek(stack));
        System.out.println("Stack after peek: " + stack);
    }

    public static int peek(Stack<Integer> stack) {
        return stack.peek();
    }
}