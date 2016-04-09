package ua.kiev.goit.victor.homework4;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Test convert temperatures on the Fahrenheit scale is set to Celsius
 */
public class TempFahrenheitToCelsiusTest {
    TempFahrenheitToCelsius tempFahrenheitToCelsius = new TempFahrenheitToCelsius();

    @Test
    public void testFindTemp() throws Exception {
        tempFahrenheitToCelsius.setTempToCelsius(10);

        double tempFahrenheit = tempFahrenheitToCelsius.findTemp();
        assertEquals(50, tempFahrenheit, 8E-8);
    }

    @Test
    public void testFindTemp1() throws Exception {
        tempFahrenheitToCelsius.setTempToCelsius(50);

        double tempFahrenheit = tempFahrenheitToCelsius.findTemp();
        assertEquals(10, tempFahrenheit, 8E-8);
    }

    @Test
    public void testFindTemp2() throws Exception {
        tempFahrenheitToCelsius.setTempToCelsius(-25);

        double tempFahrenheit = tempFahrenheitToCelsius.findTemp();
        assertEquals(-13, tempFahrenheit, 8E-8);
    }

    @Test
    public void testFindTemp3() throws Exception {
        tempFahrenheitToCelsius.setTempToCelsius(100);

        double tempFahrenheit = tempFahrenheitToCelsius.findTemp();
        assertEquals(212, tempFahrenheit, 8E-8);
    }

    @Test
    public void testFindTemp4() throws Exception {
        tempFahrenheitToCelsius.setTempToCelsius(0);

        double tempFahrenheit = tempFahrenheitToCelsius.findTemp();
        assertEquals(32, tempFahrenheit, 8E-8);
    }
}