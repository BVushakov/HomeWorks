package HW3;

public class TasksForSelfPerformance {

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
         *
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

















    }
}
