import java.util.Stack;

public class SearchElementInStack {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);

        int elementToSearch = 30;
        int position = stack.search(elementToSearch);

        if (position == -1) {
            System.out.println("Element not found in the stack.");
        } else {
            System.out.println("Element found at position (1-based index): " + position);
        }
    }
}