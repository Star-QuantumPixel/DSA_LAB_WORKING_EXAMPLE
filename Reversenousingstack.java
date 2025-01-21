import java.util.Stack;

public class ReverseNumberUsingStack {
    public static void main(String[] args) {
        int number = 12345;
        Stack<Integer> stack = new Stack<>();
        
        while (number != 0) {
            stack.push(number % 10);
            number /= 10;
        }

        int reversedNumber = 0;
        int place = 1;
        while (!stack.isEmpty()) {
            reversedNumber += stack.pop() * place;
            place *= 10;
        }

        System.out.println("Reversed Number: " + reversedNumber);
    }
}