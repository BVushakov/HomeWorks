package HW2;

import static java.lang.Math.*;

public class InterestingFormulas {
    public static void main(String...args) {

        /** Formula 9 Your version*/
        double x1 = 25.15;
        double result9 = Math.pow(1.1, x1) + Math.abs(Math.cos(Math.sqrt(PI * x1))) - (3.0 / 8.0);
        System.out.println(result9);
        System.out.println(3.0 / 8.0);
        System.out.println("");

        /** Formula 9 My version*/
        double x2 = 15;
        double result91 = 1.1 / Math.exp(x2) + Math.abs(Math.cos(Math.sqrt(PI * x2))) - (3 / 8);
        System.out.println(result91);
        System.out.println("");

        /** Formula 10*/
        double x3 = 33.4;
        double result10 = (1.0 / 3.0) * Math.sqrt(Math.abs(Math.sin(2*x3))) * Math.cbrt(Math.exp(0.12 * x3));
        System.out.println(result10);
        System.out.println("");

        /** Formula 11*/
        double x4 = 10;
        double result11 = (2 * PI * x4) - Math.abs(Math.sin(Math.sqrt(10.5 * x4))) * 1/(Math.cbrt(Math.pow(x4, 2)) + (1.0/7.0));
        System.out.println(result11);
        System.out.println("");

        /** Formula 12*/
        double x5 = 55;
        double result12 = Math.log((Math.sqrt(Math.abs(2.0 - x5))) + 1.2) * 1/(2.0 + Math.exp(-x5)) + Math.cbrt(2.0 / x5);
        System.out.println(result12);
        System.out.println("");

        /** Formula 13*/

        /** Formula 14*/
        double x6 = 10;
        double result14 = (Math.sqrt(Math.sin(3) * (x6 / 2.0)) + Math.cbrt(Math.exp(1.3 * x6) + Math.exp(-1.3 * x6))) * 1 / Math.abs(x6 + (5.0 / 2.0));
        System.out.println(result14);
        System.out.println("");

        /** Formula 15*/

        /** Formula 16*/
        double x7 = 15;
        double result16 = Math.cbrt(Math.exp(2 * x7) * Math.sqrt(x7) - (x7 + (1.0 / 3.0) / x7)) * Math.abs(Math.cos(2.5 * x7));
        System.out.println(result16);
        System.out.println("");

        /** Formula 17*/
        double x8 = 3;
        double result17 = (Math.pow(x8, 3) / 3.0) - Math.exp(x8) * Math.log(Math.abs(Math.pow(1.3, 3) + Math.pow(x8, 3))) + (4.0 / 3.0);
        System.out.println(result17);
        System.out.println("");

        /** Formula 18*/
        double x9 = 10;
        double arctg = (4.0 * (x9 / 3.0)) / (Math.sqrt(Math.pow(1.1, 3) + Math.pow(x9, 2)));
        double result18 = (Math.abs(7.2 - 10 * x9)) / (Math.cbrt(Math.pow(x9, 2) + Math.exp(x9))) * Math.atan(arctg);
        System.out.println(result18);
        System.out.println("");

        /** Formula 19*/
        double x10 = 8;
        double result19 = Math.acos(Math.tan(((5 * x10)/PI))) + Math.pow(x10, 3.2) / 28;
        System.out.println(result19);
        System.out.println("");

        /** Formula 20*/
        double x11 = 45;
        double result20 = (Math.cbrt(Math.log(2) * x11 + Math.tan(Math.cos(PI * x11)))) * Math.abs(Math.log((x11/ 10.5) + (1.0 / 3.0)));
        System.out.println(result20);
        System.out.println("");

        /** Formula 21*/

        /** Formula 22*/
        double x12 = 30;
        double result22 = Math.asin((Math.log(x12) / (Math.pow(x12, 2) + (5 * x12) + 1))) - (Math.pow(x12, 3.2) / 28);
        System.out.println(result22);
        System.out.println("");


    }
}
