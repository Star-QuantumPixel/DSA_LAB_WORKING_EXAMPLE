import java.util.Scanner;

public class SumOfFirstTenNaturalNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0; // Initialize sum variable

        for (int i = 1; i <= 10; i++) {
            sum += i;
        }

        System.out.println("Sum of first ten natural numbers is: " + sum);
    }
}
