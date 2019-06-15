package HW3;

public class TasksForSelfPerformance {

    public static final int MINNUMBER = -5;
    public static final int MAXNUMBER = 3;

    public static void main(String[] args) {

        /** Задача со скидкой */
        double sumBuy = 1001;
        double discount = sumBuy * 15 / 100;
        double sumWithDiscount = sumBuy - discount;

        if (sumBuy > 1000) {
            System.out.println("Сумма вашей покупки, со скидкой, составляет " + sumWithDiscount + " рублей.");

        } else {
            System.out.println("На сумму, " + sumBuy + " рублей, по вашей покупке, скидка не предоставляется.");
        }
        System.out.println("");


        /** Задача с площадью круга и квадрата

        Получить радиус круга: d = (√S : π) * 2 //d - диаметр, S - площадь
        Получить сторону квадрата: S = s2 //s - сторона, S - площадь
        Получить сторону квадрата: d = s√2 //d - диагональ  */

        //уместится ли круг в квадрате?

        double sSquare = 25;
        double sCircle = 35;
        double diameterCircle = (Math.sqrt(sCircle / Math.PI)) * 2;
        double getSideSquare = Math.sqrt(sSquare);//Получаем сторону квадрата
        double getDiagonalSquare = getSideSquare * Math.sqrt(2);//Получаем диагональ квадрата

        if (diameterCircle < getDiagonalSquare) {
            System.out.println("Данный круг поместится в указанном квадрате, т.к. его диагональ: " + diameterCircle + " меньше, чем диагональ: " + getDiagonalSquare + " квадрата.");
        } else {
            System.out.println("Данный круг не поместится в указанном квадрате, т.к. его диагональ: " + diameterCircle + " больше, чем диагональ: " + getDiagonalSquare + " квадрата");
        }
        System.out.println("");

        //уместится ли квадрат в круг?

        double sSquareVar = 30;
        double sCircleVar = 30;
        double diameterCircleVar = (Math.sqrt(sCircleVar / Math.PI)) * 2;
        double getSideSquareVar = Math.sqrt(sSquareVar);//Получаем сторону квадрата
        double getDiagonalSquareVar = getSideSquareVar * Math.sqrt(2);//Получаем диагональ квадрата

        if (diameterCircleVar > getDiagonalSquareVar) {
            System.out.println("Данный квадрат не поместится в указанном круге, т.к. его диагональ: " + getDiagonalSquareVar + " меньше, чем диагональ: " + diameterCircleVar + " круга.");
        } else {
            System.out.println("Данный квадрат поместится в указанном круге, т.к. его диагональ: " + getDiagonalSquareVar + " больше, чем диагональ: " + diameterCircleVar + " круга.");
        }
        System.out.println("");


        /** Задача с нахождением делителя */

        int aNum = 3;
        int bNum = 6;

        if (bNum % aNum == 0) {
            System.out.println("Число " + aNum + " является делителем числа " + bNum);
        } else {
            System.out.println("Число " + aNum + " не является делителем числа " + bNum);
        }
        System.out.println("");


        /** Задача. Принадлежит ли число к интервалу */


        int myNumber = 0;

        if (myNumber >= MINNUMBER && myNumber <= MAXNUMBER) {
            System.out.println("Число " + myNumber + " входит в диапазон от " + MINNUMBER + " до " + MAXNUMBER + ".");
        } else {
            System.out.println("Число " + myNumber + " не входит в диапазон от " + MINNUMBER + " до " + MAXNUMBER + ".");
        }
        System.out.println("");


        /** Задача про треугольник */

        int sideA = 3;
        int sideB = 3;
        int sideC = 3;

        if (sideA == sideB && sideB == sideC) {
            System.out.println("Треугольник является равнобедренным.");
        } else {
            System.out.println("Треугольник не является равнобедренным.");
        }
        System.out.println("");


        /** Задача с разными числами */

        //Самое большое

        int firstNumber = 2;
        int secondNumber = 8;
        int thirdNumber = 5;
//
        if (firstNumber > secondNumber) {
            if (secondNumber > thirdNumber){
                System.out.println("Cреднее число " + secondNumber);
            } else {
                System.out.println("Cреднее число " + thirdNumber);
            }
            System.out.println("Cреднее число " + firstNumber);
        } else {
            System.out.println("Cреднее число " + thirdNumber);
        }
    }
}
