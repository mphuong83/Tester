import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import junit.example.TriangleProgram;

public class TestTriangleProgram {
    @Test
    public void testTriangle() {
        // Kiểm tra tam giác không phải là tam giác
        assertEquals("Not a Triangle", TriangleProgram.classifyTriangle(0, 0, 0));
        assertEquals("Not a Triangle", TriangleProgram.classifyTriangle(1, 1, 3));
        assertEquals("Not a Triangle", TriangleProgram.classifyTriangle(1, 3, 1));
        assertEquals("Not a Triangle", TriangleProgram.classifyTriangle(3, 1, 1));

        // Kiểm tra tam giác cân
        assertEquals("Isosceles", TriangleProgram.classifyTriangle(3, 3, 5));
        assertEquals("Isosceles", TriangleProgram.classifyTriangle(3, 5, 3));
        assertEquals("Isosceles", TriangleProgram.classifyTriangle(5, 3, 3));

        // Kiểm tra tam giác thường
        assertEquals("Scalene", TriangleProgram.classifyTriangle(3, 4, 5));
        assertEquals("Scalene", TriangleProgram.classifyTriangle(5, 4, 3));
        assertEquals("Scalene", TriangleProgram.classifyTriangle(3, 5, 4));

        // Kiểm tra tam giác đều
        assertEquals("Equilateral", TriangleProgram.classifyTriangle(3, 3, 3));
    }
}
