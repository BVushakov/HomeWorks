package HW.HW5;

public class ConverterDistance {

    public static final double INCHESINMETER = 39.37;
    public static final double KILOMETERSINMILE = 1.609;

    public static void main(String[] args) {

        double meters = 3;
        System.out.println("Meters: " + meters + " to Inches: " + convertMeterToInces(meters));

        double inches = 200;
        System.out.println("Inches: " + inches + " to Meters: " + convertIncesToMeter(inches));

        double miles = 2.5;
        System.out.println("Miles: " + miles + " to Kilometers: " + convertMilesToKilometers(miles));

        double kilometers = 12.5;
        System.out.println("Kilometers: " + kilometers + " to Miles: " + convertKilometersToMiles(kilometers));
    }

    public static double convertMeterToInces (double meters) {
        return meters * INCHESINMETER;
    }

    public static double convertIncesToMeter (double inches) {
        return inches / INCHESINMETER;
    }

    public static double convertMilesToKilometers (double miles) {
        return miles * KILOMETERSINMILE;
    }

    public static double convertKilometersToMiles (double kilometers) {
        return kilometers / KILOMETERSINMILE;
    }
}
