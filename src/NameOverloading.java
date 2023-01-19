// method overloading
// variable = arguments = field same meaning different words
// parameter = variable you pass on when you create the method
public class NameOverloading {
    public static void main(String[] args) { //main method
        fName(); // passing no arguments
        fName("William"); // passing 1  argument
        fName ("Diana", "Spencer"); // passing 2 arguments
    }
    // methods to pass on first name
    public static void fName() {
        System.out.println("Your name is Ada Lovelace");
    }
    public static void fName(String firstName) { // passing fname  parameter
        System.out.println(firstName + " Smith");
    }
    public static void fName (String firstName, String lastName) {
        System.out.println(firstName + " " + lastName);
    }
}