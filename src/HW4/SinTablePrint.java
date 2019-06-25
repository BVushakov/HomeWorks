package HW4;

public class SinTablePrint {
    public static void main(String[] args) {
        for (double step = 0.0; step < 2 * Math.PI; step += Math.PI / 18.0) {
            double res =  Math.sin(step);
            System.out.println(res);
        }
        /** Проверить в https://planetcalc.ru/307/ */
    }
}
