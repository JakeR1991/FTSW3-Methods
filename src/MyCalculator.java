import java.util.Scanner;

public class MyCalculator {
    public static void main(String[] args) {
        // Create a new Scanner object to read input from the user
        Scanner sc = new Scanner(System.in);

        // Prompt the user to enter the first number
        System.out.print("Enter first number: ");
        double num1 = sc.nextDouble();

        // Prompt the user to enter the second number
        System.out.print("Enter second number: ");
        double num2 = sc.nextDouble();

        // Call the add method and print the result
        System.out.println("Addition: " + add(num1, num2));

        // Call the subtract method and print the result
        System.out.println("Subtraction: " + subtract(num1, num2));

        // Call the multiply method and print the result
        System.out.println("Multiplication: " + multiply(num1, num2));

        // Call the divide method and print the result
        System.out.println("Division: " + divide(num1, num2));
    }

    // Add method that takes in two numbers as parameters and returns their sum
    public static double add(double num1, double num2) {
        return num1 + num2;
    }

    // Subtract method that takes in two numbers as parameters and returns the difference
    public static double subtract(double num1, double num2) {
        return num1 - num2;
    }

    // Multiply method that takes in two numbers as parameters and returns their product
    public static double multiply(double num1, double num2) {
        return num1 * num2;
    }

    // Divide method that takes in two numbers as parameters and returns the quotient
    public static double divide(double num1, double num2) {
        if (num2 == 0) {
            System.out.println("Cannot divide by 0.");
            return 0;
        }
        return num1 / num2;
    }
}
