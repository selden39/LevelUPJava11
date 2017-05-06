package geometricFigure;

import java.lang.reflect.Array;

public class Line {
    double a;
    double b;
    double c;

    public Line(double a, double b, double c){
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public String createLine (double x1, double x2){
        double y1 = (- c - a * x1) / b;
        double y2 = (- c - a * x2) / b;
        String result = "  y1 =" + y1 + "  y2 = " + y2;
        return result;


    }

}
