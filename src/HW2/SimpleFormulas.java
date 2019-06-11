package HW2;

public class SimpleFormulas {
    public static void main (String... args) {

        /**Celsius = 5/9 (F - 32)
         Kelvin = C + 273.16*/

        /**1) Convert Celsius to Fahrenheit*/
        System.out.println("");
        double celsiusC2F = 0d;//your number
        double var = 9/5d;
        double celsiusToFahrenheit = celsiusC2F * var + 32d;
        System.out.println(celsiusToFahrenheit + " Fahrenheit");
        System.out.println("");

        /**2) Convert Fahrenheit to Celsius*/
        double fahrenheit = 0;//your number
        double fahrenheitToCelsius = (fahrenheit- 32) * 5/9;
        System.out.println(fahrenheitToCelsius + " Celsius");
        System.out.println("");

        /**3) Convert Celsius to Kelvin*/
        double celsius = 0;//your number
        double celsiusToKelvin = celsius + 273.16;
        System.out.println(celsiusToKelvin + " Kelvin");
        System.out.println("");

        /**1m = 39.37in
        1mi = 1.609km
        1kg = 2.2046lb
        1km/hr = 0.6214mi/hr*/

        /**4) Convert meters to inches. And reverse*/
        double meters = 1d;//your number
        double inchesInMeter = 39.37d;// constant
        double numberOfInchesPerMeter = meters * inchesInMeter;
        System.out.println(numberOfInchesPerMeter + " inches in " + meters + " meters");

        double inches = 100d;//your number
        double inchesInMeterVar = 39.37d;// constant
        double numberOfMetersPerInche = inches / inchesInMeterVar;
        System.out.println(numberOfMetersPerInche + " meters in " + inches + " inche");
        System.out.println("");


        /**5) Convert miles to kilometers. And reverse*/
        double miles = 10d;//your number
        double kilometersInMile = 1.609d;// constant
        double numberOfKilometersPerMile = miles * kilometersInMile;
        System.out.println(numberOfKilometersPerMile + " kilometers in " + miles + " miles");

        double kilometres = 120d;//your number
        double kilometresInMileVar = 1.609d;// constant
        double numberOfKilometresPerMiles = kilometres / kilometresInMileVar;
        System.out.println(numberOfKilometresPerMiles + " miles in " + kilometres + " kilometres");
        System.out.println("");



        /**6) Convert kilograms to pounds. And reverse*/
        double kilograms = 1d;//your number
        double poundsInKilograms = 2.2046d;// constant
        double numberOfPoundsPerKilograms = kilograms * poundsInKilograms;
        System.out.println(numberOfPoundsPerKilograms + " pounds in " + kilograms + " kilograms");

        double pounds = 31.0d;//your number
        double poundsInKilogramsVar = 2.2046d;// constant
        double numberOfPoundsPerKilogramsVar = pounds / poundsInKilogramsVar;
        System.out.println(numberOfPoundsPerKilogramsVar + " kilograms in " + pounds + " pounds");
        System.out.println("");

        /**7) Convert speed km/hr to mi/hr. And reverse*/
        double speedKmHr = 50d;//your number
        double speedMiHrInSpeedKmHr = 0.6214d;// constant
        double numberOfspeedMilePerHours = speedKmHr * speedMiHrInSpeedKmHr;
        System.out.println(numberOfspeedMilePerHours + " speed Mi/Hr in " + speedKmHr + " speed Km/Hr");

        double speedMiHr = 90d;//your number
        double speedKmHrInSpeedMiHr = 1.609d;// constant
        double numberOfspeedKilometersPerHours = speedMiHr * speedKmHrInSpeedMiHr;
        System.out.println(numberOfspeedKilometersPerHours + " speed Km/Hr in " + speedMiHr + " speed Mi/Hr");
        System.out.println("");



    }
}