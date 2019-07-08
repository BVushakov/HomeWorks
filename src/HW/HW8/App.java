package HW.HW8;

public class App extends TestBase{
    private static TestLogger logger = new TestLogger();
    public static void main(String[] args) {

        App app = new App();
        app.setUp();

        FractionNumbers fractionNumbersFirst = new FractionNumbers(1, 7);
        FractionNumbers fractionNumbersSecond = new FractionNumbers(1, 7);

        FractionNumbers fractionNumbersResult = fractionNumbersFirst.plus(fractionNumbersSecond);
        logger.log("Result of addition of " + fractionNumbersFirst + " and " + fractionNumbersSecond + " is: " + fractionNumbersResult);

        fractionNumbersResult = fractionNumbersFirst.minus(fractionNumbersSecond);
        logger.log("Result of subtraction of " + fractionNumbersFirst + " and " + fractionNumbersSecond + " is: " + fractionNumbersResult);

        fractionNumbersResult = fractionNumbersFirst.divide(fractionNumbersSecond);
        logger.log("Result of division of " + fractionNumbersFirst + " and " + fractionNumbersSecond + " is: " + fractionNumbersResult);

        fractionNumbersResult = fractionNumbersFirst.multiply(fractionNumbersSecond);
        logger.log("Result of multiplication of " + fractionNumbersFirst + " and " + fractionNumbersSecond + " is: " + fractionNumbersResult);

        System.out.println(fractionNumbersFirst.equals(fractionNumbersSecond));
        System.out.println(fractionNumbersFirst.toString());


        app.tearDown();
    }
}