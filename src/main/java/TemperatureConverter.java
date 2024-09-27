public class TemperatureConverter {

    // Method to convert Kelvin to Fahrenheit
    public static double kelvinToFah(double kel) {
        return Math.round(((kel - 273.15) * (9.0 / 5.0) + 32) * 100.0) / 100.0; // Rounds to two decimal places
    }

    // Example of Fahrenheit to Celsius
    public double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    // Example of Celsius to Fahrenheit
    public double celsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    // Example of checking extreme temperatures
    public boolean isExtremeTemperature(double temp) {
        return temp < -30 || temp > 50;
    }
}
