package ua.kiev.goit.victor.homework4;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Test area of a circle
 */
public class CircleTest {
    Circle circle = new Circle();

    @Test
    public void testFindSquare() throws Exception {
        circle.setRadius(5);

        double circleSquare = circle.findSquare();
        assertEquals(78.5398, circleSquare, 5E-5);
    }

    @Test
    public void testFindSquare1() throws Exception {
        circle.setRadius(1);

        double circleSquare = circle.findSquare();
        assertEquals(Math.PI, circleSquare, 5E-5);
    }

    @Test
    public void testFindSquare2() throws Exception {
        circle.setRadius(0);

        double circleSquare = circle.findSquare();
        assertEquals(0, circleSquare, 5E-5);
    }
}