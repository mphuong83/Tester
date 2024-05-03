import org.junit.jupiter.api.Test;

import junit.example.TriangleClassifier;

import static org.junit.jupiter.api.Assertions.*;

public class TriangleClassifierTest {

    @Test
    public void testEquilateralTriangle() {
        assertEquals("Equilateral", TriangleClassifier.classifyTriangle(3, 3, 3));
    }

    @Test
    public void testIsoscelesTriangle() {
        assertEquals("Isosceles", TriangleClassifier.classifyTriangle(3, 3, 2));
    }

    @Test
    public void testScaleneTriangle() {
        assertEquals("Scalene", TriangleClassifier.classifyTriangle(3, 4, 5));
    }

    @Test
    public void testRightTriangle() {
        assertEquals("Right", TriangleClassifier.classifyTriangle(3, 4, 5));
    }

    @Test
    public void testNotATriangle() {
        assertEquals("NotATriangle", TriangleClassifier.classifyTriangle(1, 2, 3));
    }
}