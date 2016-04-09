package ua.kiev.goit.victor.homework4;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Test convert temperatures on the Celsius scale is set to Fahrenheit
 */
public class TempCelsiusToFahrenheitTest {
    TempCelsiusToFahrenheit tempCelsiusToFahrenheit = new TempCelsiusToFahrenheit();

    @Test
    public void testFindTemp() throws Exception {
        tempCelsiusToFahrenheit.setTempFahrenheit(104);

        double tempCelsius = tempCelsiusToFahrenheit.findTemp();
        assertEquals(40, tempCelsius, 10E-5);
    }

    @Test
    public void testFindTemp1() throws Exception {
        tempCelsiusToFahrenheit.setTempFahrenheit(-58);

        double tempCelsius = tempCelsiusToFahrenheit.findTemp();
        assertEquals(-50, tempCelsius, 10E-5);
    }

    @Test
    public void testFindTemp2() throws Exception {
        tempCelsiusToFahrenheit.setTempFahrenheit(68);

        double tempCelsius = tempCelsiusToFahrenheit.findTemp();
        assertEquals(20, tempCelsius, 10E-5);
    }

    @Test
    public void testFindTemp3() throws Exception {
        tempCelsiusToFahrenheit.setTempFahrenheit(212);

        double tempCelsius = tempCelsiusToFahrenheit.findTemp();
        assertEquals(100, tempCelsius, 10E-5);
    }

    @Test
    public void testFindTemp4() throws Exception {
        tempCelsiusToFahrenheit.setTempFahrenheit(97.88);

        double tempCelsius = tempCelsiusToFahrenheit.findTemp();
        assertEquals(36.6, tempCelsius, 10E-5);
    }
}