package ua.kiev.goit.victor.homework4;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Test
 */
public class TriangleTest {
    Triangle triangle = new Triangle();

    @Test
    public void testFindSquare() throws Exception {
        triangle.setSide1(3);
        triangle.setSide2(4);
        triangle.setSide3(5);

        double trigonSquare = triangle.findSquare();
        assertEquals(6.0,trigonSquare, 8E-6);
    }

    @Test
    public void testFindSquare1() throws Exception {
        triangle.setSide1(4);
        triangle.setSide2(6);
        triangle.setSide3(6);

        double trigonSquare = triangle.findSquare();
        assertEquals(11.313708498984761,trigonSquare, 8E-6);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFindSquare2() throws Exception {
        triangle.setSide1(3);
        triangle.setSide2(-4);
        triangle.setSide3(-5);

        double trigonSquare = triangle.findSquare();
        assertEquals(6.0,trigonSquare, 8E-6);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFindSquare3() throws Exception {
        triangle.setSide1(3);
        triangle.setSide2(-4);
        triangle.setSide3(5);

        double trigonSquare = triangle.findSquare();
        assertEquals(6.0,trigonSquare, 8E-6);
    }

    @Test
    public void testFindSquare4() throws Exception {
        triangle.setSide1(2);
        triangle.setSide2(3);
        triangle.setSide3(5);

        double trigonSquare = triangle.findSquare();
        assertEquals(0,trigonSquare, 8E-6);
    }
}