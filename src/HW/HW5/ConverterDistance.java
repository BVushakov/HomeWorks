package HW.HW5;

public class ConverterDistance {

    public static final double INCHESINMETER = 39.37;

    public static void main(String[] args) {

        double meters = 3;
        System.out.println("Meters: " + meters + " to Inches: " + convertMeterToInces(meters));

        double inches = 200;
        System.out.println("Inches: " + inches + " to Meters: " + convertIncesToMeter(inches));
    }

    public static double convertMeterToInces (double meters) {
        return meters * INCHESINMETER;
    }

    public static double convertIncesToMeter (double inches) {
        return inches / INCHESINMETER;
    }
}
