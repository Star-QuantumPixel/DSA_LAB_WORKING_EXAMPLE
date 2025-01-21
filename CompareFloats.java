import java.util.Scanner;

public class CompareFloats {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double num1 = scanner.nextDouble();
        double num2 = scanner.nextDouble();
        scanner.close();

        num1 = Math.round(num1 * 1000) / 1000.0;
        num2 = Math.round(num2 * 1000) / 1000.0;

        if (num1 == num2) {
            System.out.println("The numbers are the same up to three decimal places.");
        } else {
            System.out.println("The numbers are different.");
        }
    }
}
