package ua.kiev.goit.victor.homework4;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Test area of a rectangle
 */
public class RectangleTest {
    Rectangle rectangle = new Rectangle();

    @Test
    public void testFindSquare() throws Exception {
        rectangle.setSide1(2);
        rectangle.setSide2(4);

        double rectangleSquare = rectangle.findSquare();
        assertEquals(8,rectangleSquare, 10E-5);
    }

    @Test
    public void testFindSquare1() throws Exception {
        rectangle.setSide1(5);
        rectangle.setSide2(6);

        double rectangleSquare = rectangle.findSquare();
        assertEquals(30,rectangleSquare, 10E-5);
    }

    @Test
    public void testFindSquare2() throws Exception {
        rectangle.setSide1(1);
        rectangle.setSide2(1);

        double rectangleSquare = rectangle.findSquare();
        assertEquals(1,rectangleSquare, 10E-5);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFindSquare3() throws Exception {
        rectangle.setSide1(-2);
        rectangle.setSide2(2);

        double rectangleSquare = rectangle.findSquare();
        assertEquals(4,rectangleSquare, 10E-5);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFindSquare4() throws Exception {
        rectangle.setSide1(-2);
        rectangle.setSide2(-2);

        double rectangleSquare = rectangle.findSquare();
        assertEquals(-4,rectangleSquare, 10E-5);
    }
}