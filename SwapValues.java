public class SwapValues {
    int a, b;

    public SwapValues(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public void swap() {
        a = a + b;
        b = a - b;
        a = a - b;
    }

    public static void main(String[] args) {
        SwapValues obj = new SwapValues(5, 10);
        obj.swap();
        System.out.println("a: " + obj.a + ", b: " + obj.b);
    }
}
