// overload the method with different data types
public class NumberMethod {
    static int sumNum (int x, int y) { // get whole numbers
        return x+y; // use return keyword, specify the datatype on method header
    }

    static double sumNum (double x, double y) { // get decimal  numbers
        return x+y;
    }

    public static void main(String[] args) {
        // print here, not on the method
        System.out.println(sumNum(5, 5));
        System.out.println(sumNum (14, 90));
        System.out.println(sumNum(11.4 , 35.6));
        System.out.println(sumNum(91.5, 75.5));
        System.out.println(sumNum(9100000, 75686888));

        int sumIntNum = sumNum(24,6);
        System.out.println(sumIntNum);

    }

}
