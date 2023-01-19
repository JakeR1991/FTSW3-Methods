public class FibonacciCalc {
    public static void main(String[] args) {
        // calling the Fibonacci method
        Fibonacci();
    }

    public static void Fibonacci() {
        // first two numbers of Fibonacci sequence
        int n1 = 0, n2 = 1, n3, i, count = 50;

        // printing the first two numbers
        System.out.print(n1 + " " + n2);
        for (i = 2; i < count; ++i) {
            n3 = n1 + n2;
            System.out.print(" " + n3);
            n1 = n2;
            n2 = n3;
        }
    }
}