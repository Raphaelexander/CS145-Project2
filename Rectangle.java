import java.util.Scanner;

public class Rectangle{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input the x1 coordinate:");
        System.out.print("x2--x4\n-    -\n-    -\nx1--x3");
        int x1 = input.nextInt();
        int y1 = input.nextInt();
        
        if(x1 < 0 || y1 < 0) {
            System.out.print("Invalid input, please input a positive integer");
        } else {
            System.out.println("\nInput the x4 coordinate:");
            int x4 = input.nextInt();
            int y4 = input.nextInt();

            if(x4 < 0 || y4 < 0) {
                System.out.print("Invalid input, please input a positive integer");
            }
        }

        //RectangleTest.newRectangle = RectangleTest.function(int x1, int y1, int x4, int y4);
    }
}