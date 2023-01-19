import java.math.BigInteger;

public class FibonacciCalcBigInteger {
    public static void main(String[] args) {
        // calling the Fibonacci method
        Fibonacci();
    }

    public static void Fibonacci() {
        // first two numbers of Fibonacci sequence
        BigInteger n1 = BigInteger.ZERO, n2 = BigInteger.ONE, n3;
        int count = 100; // number of Fibonacci numbers to generate

        // printing the first two numbers
        System.out.print(n1 + " " + n2);

        // using a for loop to generate the next Fibonacci numbers
        for (int i = 2; i < count; ++i) {
            // using the add method of BigInteger to add the previous two numbers
            n3 = n1.add(n2);
            // printing the current number
            System.out.print(" " + n3);
            // updating n1 and n2
            n1 = n2;
            n2 = n3;
        }
    }
}
