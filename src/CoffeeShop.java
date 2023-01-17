public class CoffeeShop {
    // Your exercise to create a method called coffee()
    // pass on two parameters, orderName and price
    // on your main method, pass on these orders
    // Cappuccino, 4.5
    // Mocha, 3.5
    // Flat White, 4.0

    // Define a method called coffee that takes in a string and a double as parameters
    public static void coffee(String orderName, double price) {
        // Print the order details
        System.out.println("Your order of " + orderName + " is ready! It costs " + price);
        }
        public static void main(String[] args) {
            // Call the coffee method with the order name and price
            coffee("Cappuccino", 4.5);
            coffee("Mocha", 3.5);
            coffee("Flat White", 4.0);
        }
    }
