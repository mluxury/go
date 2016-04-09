package ua.kiev.goit.victor.homework4;

/**
 * Convert temperatures on the Celsius scale is set to Fahrenheit
 */
public class TempCelsiusToFahrenheit {
    private double tempFahrenheit;

    public TempCelsiusToFahrenheit(){
    }

    public double getTempFahrenheit() {
        return tempFahrenheit;
    }

    public void setTempFahrenheit(double tempFahrenheit) {
        this.tempFahrenheit = tempFahrenheit;
    }

    public double findTemp(){
        double tempCelsius = (tempFahrenheit - 32) * 5 / 9;
        return tempCelsius;
    }
}
