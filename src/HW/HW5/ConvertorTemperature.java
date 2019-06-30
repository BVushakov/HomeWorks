package HW.HW5;

public class ConvertorTemperature {

    public static final double KELVIN = 273.16;//water freezing point
    public static final double ICEMELTINGPOINT = 32;//Fahrenheit
    public static final double DEGREEFAHRENHEITTOCELSIUS = 1.8000;//https://www.metric-conversions.org/ru/temperature/celsius-to-fahrenheit.htm

    public static void main(String[] args) {

        double celsius = 15;//your number
        double kelvin = 300;//your number
        double fahrenheit = 80;//your number

        System.out.println("Celsius " + celsius + " -> Kelvin " + convertCelsiusToKelvin(celsius) );
        System.out.println("Kelvin " + kelvin + " -> Celsius " + convertKelvinToCelsius(kelvin) );
        System.out.println("Celsius " + celsius + " -> Fahrenheit " + convertCelsiusToFahrenheit(celsius));
        System.out.println("Fahrenheit " + fahrenheit + " -> Celsius " + convertFahrenheitToCelsius(fahrenheit));
    }

    public static double convertCelsiusToKelvin(double celsius) {
        return celsius + KELVIN;
    }

    public static double convertKelvinToCelsius(double kelvin) {
        return kelvin - KELVIN;
    }

    public static double convertCelsiusToFahrenheit(double celsius) {
        return celsius * DEGREEFAHRENHEITTOCELSIUS + ICEMELTINGPOINT;
    }

    public static double convertFahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - ICEMELTINGPOINT) / DEGREEFAHRENHEITTOCELSIUS;
    }
}
