package HW.HW7;

public class App {
    public static void main(String[] args) {

        FractionNumbers fractionNumbersFirst = new FractionNumbers(4, 10);
        FractionNumbers fractionNumbersSecond = new FractionNumbers(2, 10);
        FractionNumbers fractionNumbersResult = fractionNumbersFirst.plus(fractionNumbersSecond);

        System.out.println("Result of addition of " + fractionNumbersFirst + " and " + fractionNumbersSecond + " is: " + fractionNumbersResult);
        fractionNumbersResult = fractionNumbersFirst.minus(fractionNumbersSecond);

        System.out.println("Result of subtraction of " + fractionNumbersFirst + " and " + fractionNumbersSecond + " is: " + fractionNumbersResult);
        fractionNumbersResult = fractionNumbersFirst.divide(fractionNumbersSecond);

        System.out.println("Result of division of " + fractionNumbersFirst + " and " + fractionNumbersSecond + " is: " + fractionNumbersResult);
        fractionNumbersResult = fractionNumbersFirst.multiply(fractionNumbersSecond);

        System.out.println("Result of multiplication of " + fractionNumbersFirst + " and " + fractionNumbersSecond + " is: " + fractionNumbersResult);

        System.out.println(fractionNumbersFirst.toString());
    }
}
