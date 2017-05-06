import java.awt.*;
import java.util.Scanner;
import static java.lang.Math.PI;

public class Circle {
    double x;
    double y;
    double r;

    public Circle(double x, double y, double r) {
        this.x = x;
        this.y = y;
        this.r = r;
    }

    public Circle (double r){
        this.r = r;
    }

    public static void main(String[] args) {
        // input Parameter
        System.out.println("Input x ");
        double x = InputCoordinate();
        System.out.println("Input y ");
        double y = InputCoordinate();
        System.out.println("Input R ");
        double r = InputRadius();
        // print Parameter
        System.out.println("x = " + x + ",  y = " + y + ",  R = " + r);
        // create object
        if (x <= 0.000_000_1 && y <= 0.000_000_1){
            Circle c1 = new Circle(r);
            System.out.println("x and y = 0");
        } else {
            Circle c1 = new Circle(x, y, r);
            System.out.println("normal circle");
        }
        // change radius
        System.out.println("Input change R ");
        double changeRadius = InputChangeRadius(r);
        r = ChangeRadius(r, changeRadius);
        // print new Parameter
        System.out.println("New parameter");
        System.out.println("x = " + x + ",  y = " + y + ",  R = " + r);
        //check point into circle? Xp^2 + Yp^2 < r^2
        System.out.println("Input x point");
        double xPoint = InputCoordinate();
        System.out.println("Input y point");
        double yPoint = InputCoordinate();
        CheckPointIntoCircle(x, y, r, xPoint, yPoint);
        // calculate length
        double lengthCircle = CalculateLength(r);
        System.out.println("Length circle = " + lengthCircle);
        // calculate diameter
        double diameterCircle = CalculateDiameter(r);
        System.out.println("Diameter circle = " + diameterCircle);
        // return string info about circle
        String infoCircle = InfoAboutCircle(x, y, r);
        System.out.println(infoCircle);
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

    static double InputRadius() {
        Scanner scan = new Scanner(System.in);
        boolean inputCorrect = false;
        double input = 0;
        do {
            if (scan.hasNextDouble()) {
                input = scan.nextDouble();
                if (input < 0) {
                    System.out.println("Error input, repeat");
                    inputCorrect = false;
                } else {
                    inputCorrect = true;
                }

            } else {
                System.out.println("Error input, repeat");
                scan.next();
                inputCorrect = false;
            }
        }
        while (!inputCorrect);
        return input;
    }

    static double InputChangeRadius(double r) {
        Scanner scan = new Scanner(System.in);
        boolean inputCorrect = false;
        double input = 0;
        do {
            if (scan.hasNextDouble()) {
                input = scan.nextDouble();
                // почему не доступна переменная r, если ее не передавать в параметре ?
                if (r + input < 0) {
                    System.out.println("Error input, repeat");
                    inputCorrect = false;
                } else {
                    inputCorrect = true;
                }

            } else {
                System.out.println("Error input, repeat");
                scan.next();
                inputCorrect = false;
            }
        }
        while (!inputCorrect);
        return input;
    }

    // почему не дает использовать void ChangeRadius (double changeRadius)? нужно обязательно static
    // и переменная r не видна, если ее не передавать через параметр
    static double ChangeRadius (double r, double changeRadius) {
        return r = r + changeRadius;
    }

    static void CheckPointIntoCircle (double x, double y, double r, double xPoint, double yPoint) {
        double reducedPointX = xPoint - x;
        double reducedPointY = yPoint - y;
        if (((reducedPointX * reducedPointX) + (reducedPointY * reducedPointY)) <= r*r ){
            System.out.println("Point into circle");
        } else {
            System.out.println("Point out circle");
        }

    }

    static double CalculateLength (double r) {
        return PI*r*r;
    }

    static double CalculateDiameter (double r) {
        return r*2;
    }

    static String InfoAboutCircle (double x, double y, double r) {
        return "Radius = " + r + " Center: " + x + "; " + y;
    }

}
