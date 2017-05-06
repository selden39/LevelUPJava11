package geometricFigure;

import java.util.Random;
import java.util.Scanner;

public class GeometricFigures {
    public static void main(String[] args) {
        System.out.println("=====  Creating point  =====");
        System.out.println("Input x ");
        double x = InputCoordinate();
        System.out.println("Input y ");
        double y = InputCoordinate();
        Point point1 = new Point (x, y);
        System.out.println("Object point with x = " + x + ", y = " + y + " created");

        System.out.println("=====  Creating line Ax + By + C = 0  =====");
        Random random = new Random();
        double a = random.nextDouble();
        double b = random.nextDouble();
        double c = random.nextDouble();
        System.out.println("A = " + a + " B = " + b + " C = " + c);
        Line line1 = new Line(a, b, c );
        System.out.println("Input x1 ");
        double xLine1 = InputCoordinate();
        System.out.println("Input x2 ");
        double xLine2 = InputCoordinate();
        String yLine = line1.createLine(xLine1, xLine2);
        System.out.println("x1 = " + xLine1 + "  x2 = " + xLine2 + yLine);
    }


    static double InputCoordinate() {
        Scanner scan = new Scanner(System.in);
        boolean inputCorrect = false;
        double input = 0;
        do {
            if (scan.hasNextDouble()) {
                input = scan.nextDouble();
                inputCorrect = true;
            } else {
                System.out.println("Error input, repeat");
                scan.next();
                inputCorrect = false;
            }
        }
        while (!inputCorrect);
        return input;
    }




}
