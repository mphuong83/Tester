package junit.example;

public class TriangleProgram {
    public static String classifyTriangle(int a, int b, int c) {
        int match = 0;

        if (a == b)
            match += 1;
        if (a == c)
            match += 2;
        if (b == c)
            match += 3;

        if (match == 0) {
            if ((a + b) <= c || (b + c) <= a || (a + c) <= b)
                return "Not a Triangle";
            else
                return "Scalene";
        } else if (match == 1 || match == 2 || match == 3) {
            if ((a + b) <= c || (b + c) <= a || (a + c) <= b)
                return "Not a Triangle";
            else
                return "Isosceles";
        } else {
            if ((a + b) <= c || (b + c) <= a || (a + c) <= b)
                return "Not a Triangle";
            else
                return "Equilateral";
        }
    }
}
