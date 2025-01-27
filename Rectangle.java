import java.util.Scanner;

public class Rectangle {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input the x1 coordinate:");
        System.out.print("x2--x4\n-    -\n-    -\nx1--x3");
        int x1 = input.nextInt();
        int y1 = input.nextInt();
        
        RectangleTest.testPointOne(x1, y1);

        System.out.println("\nInput the x4 coordinate:");
        int x4 = input.nextInt();
        int y4 = input.nextInt();

        RectangleTest.testPointFour(x4, y4);

        RectangleTest.findPoints(x1, y1, x4, y4);
        System.out.println("The area is " + RectangleTest.calculateArea(x1, y1, x4, y4));
        System.out.print("The perimeter is " + RectangleTest.calculatePerimeter(x1, y1, x4, y4));
    }
}
