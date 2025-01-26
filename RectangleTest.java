class RectangleTest {

    public static void findPoints(int x1, int y1, int x4, int y4) {
        int x2 = x1;
        int y3 = y1;
        int y2 = y4;
        int x3 = x1;

        System.out.println("Point x1 is located at (" + x1 + ", " + y1 + ")");
        System.out.println("Point x2 is located at (" + x2 + ", " + y2 + ")");
        System.out.println("Point x3 is located at (" + x3 + ", " + y3 + ")");
        System.out.println("Point x4 is located at (" + x4 + ", " + y4 + ")");
    }

    public static void testRectangle(int x1, int y1, int x4, int y4) { // tests rectangle

    }

    public static int calculateArea(int x1, int y1, int x4, int y4) { // calculates the area of the rectangle
        int length = Math.abs(x4 - x1);
        int width = Math.abs(y4 - y1);
        return length * width;
    }

    public static int calculatePerimeter(int x1, int y1, int x4, int y4) { // calculates the perimeter of the rectangle
        int length = Math.abs(x4 - x1);
        int width = Math.abs(y4 - y1);
        return 2 * (length + width);
    }
}
