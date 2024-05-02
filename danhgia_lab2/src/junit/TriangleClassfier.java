package junit;

public class TriangleClassfier {
    public static String classifyTriangle(int a, int b, int c) {
        if (isValidTriangle(a, b, c)) {
            if (a == b && b == c) {
                return "Equilateral";
            } else if (a == b || b == c || a == c) {
                return "Isosceles";
            } else if (isRightTriangle(a, b, c)) {
                return "Right";
            } else {
                return "Scalene";
            }
        } else {
            return "NotATriangle";
        }
    }

    private static boolean isValidTriangle(int a, int b, int c) {
        return (a + b > c) && (a + c > b) && (b + c > a);
    }
    private static boolean isRightTriangle(int a, int b, int c) {
        int max = Math.max(Math.max(a, b), c);
        if (max == a) {
            return a * a == b * b + c * c;
        } else if (max == b) {
            return b * b == a * a + c * c;
        } else {
            return c * c == a * a + b * b;
        }
    }
}
