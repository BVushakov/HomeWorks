package HW.HW3;

public class CheckOddEven {

    public static void main(String[] args) {

        String passVar = "Odd Number";
        String failVar = "Even Number";
        int number = 12001;//your number
        int remainderOfTheDivision = number % 2;

        if (remainderOfTheDivision == 0) {
            System.out.println(passVar);
        } else {
            System.out.println(failVar);
        }

    }

}
