package HW.HW3;

public class QuadraticEquation {
    public static void main(String[] args) {
        //http://edu.glavsprav.ru/info/diskriminant/

        double a = 1;
        double b = 2;
        double c = 3;
        double D = b * b - 4 * a * c;//b2 - 4ac

        if (a == 0){
            System.out.println("Коэффициент при первом слагаемом уравнения не может быть равным нулю");
        } else if (D > 0) {
            double x1 = (-b - Math.sqrt(D)) / (2 * a);
            double x2 = (-b + Math.sqrt(D)) / (2 * a);
            System.out.println("Корни уравнения: x1 = " + x1 + ", x2 = " + x2);
        } else if (D == 0) {
            double x;
            x = -b / (2 * a);
            System.out.println("Уравнение имеет единственный корень: x = " + x);
        }else {
            System.out.println("Уравнение не имеет действительных корней!");
        }
    }
}