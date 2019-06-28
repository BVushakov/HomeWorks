package HW.HW3;

public class ComparisonValue {

    public static void main (String...args) {

        int firstNumber = 0;
        int secondNumber = 0;

        if (Math.abs(firstNumber) > Math.abs(secondNumber)) {
            System.out.println("Число " + firstNumber + " имеет большую величину.");
        } else if (Math.abs(secondNumber) > Math.abs(firstNumber)){
            System.out.println("Число " + secondNumber + " имеет большую величину.");
        } else {
            System.out.println("Числа, " + firstNumber + " и " + secondNumber + " - равны!");
        }
    }
}
