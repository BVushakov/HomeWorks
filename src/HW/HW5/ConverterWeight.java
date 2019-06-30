package HW.HW5;

public class ConverterWeight {

    public static final double POUNDSINKILOGRAM = 2.2046;

    public static void main(String[] args) {
        double pounds = 40;
        System.out.println("Pounds: " + pounds + " to Kilograms: " + converterPoundsToKilograms(pounds));

        double kilograms = 3.5;
        System.out.println("Kilograms: " + kilograms + " to Pounds: " + converterKilogramsToPounds(kilograms));
    }

    public static double converterPoundsToKilograms (double pounds) {
        return pounds / POUNDSINKILOGRAM;
    }

    public static double converterKilogramsToPounds (double kilograms) {
        return kilograms * POUNDSINKILOGRAM;
    }
}
