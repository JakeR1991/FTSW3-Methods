import java.util.Scanner;

class MinMaxMethods {
    public static void main(String[] args) {
        // read 3 numbers from user
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter three numbers: ");
        double num1 = scanner.nextDouble();
        double num2 = scanner.nextDouble();
        double num3 = scanner.nextDouble();
        getMinMax(num1, num2, num3);
    }

    // method to return the minimum of three whole numbers
    public static int min(int num1, int num2, int num3) {
        return Math.min(Math.min(num1, num2), num3);
    }

    // method to return the maximum of three whole numbers
    public static int max(int num1, int num2, int num3) {
        return Math.max(Math.max(num1, num2), num3);
    }

    //overloaded methods to accept double values
    public static double min(double num1, double num2, double num3) {
        return Math.min(Math.min(num1, num2), num3);
    }

    public static double max(double num1, double num2, double num3) {
        return Math.max(Math.max(num1, num2), num3);
    }

    //method to choose the correct method to call depending on user input
    public static void getMinMax(double num1,double num2,double num3){
        if (num1 % 1 == 0 && num2 % 1 == 0 && num3 % 1 == 0) {
            System.out.println("Minimum: " + min((int)num1, (int)num2, (int)num3));
            System.out.println("Maximum: " + max((int)num1, (int)num2, (int)num3));
        } else {
            System.out.println("Minimum: " + min(num1, num2, num3));
            System.out.println("Maximum: " + max(num1, num2, num3));
        }
    }
}
