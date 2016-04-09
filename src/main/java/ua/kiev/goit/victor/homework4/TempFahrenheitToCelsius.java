package ua.kiev.goit.victor.homework4;

/**
 * Convert temperatures on the Fahrenheit scale is set to Celsius
 */
public class TempFahrenheitToCelsius {
    private double tempToCelsius;

    public TempFahrenheitToCelsius(){
    }

    public double getTempToCelsius() {
        return tempToCelsius;
    }

    public void setTempToCelsius(double tempToCelsius) {
        this.tempToCelsius = tempToCelsius;
    }

    public double findTemp(){
        double tempFahrenheit = (4.0 / 5.0 + 1.0) * tempToCelsius + 32;
        return tempFahrenheit;
    }
}
