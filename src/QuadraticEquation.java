import java.util.*;
public class QuadraticEquation {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        double a = scan.nextDouble();
        double b = scan.nextDouble();
        double c = scan.nextDouble();
        double d;
        // if a == 0 b == 0 c == 0  Result -1
        if ((Math.abs(a) < 0.000_000_1) && (Math.abs(b) < 0.000_000_1) && (Math.abs(c) < 0.000_000_1)) {
            System.out.println("-1");
        } else {
            //  a == 0 and b != 0 and c ==0   Result 1
            if (((Math.abs(a) < 0.000_000_1) && (Math.abs(b) >= 0.000_000_1) && (Math.abs(c) < 0.000_000_1)) || ((Math.abs(a) >= 0.000_000_1) && (Math.abs(b) < 0.000_000_1) && (Math.abs(c) < 0.000_000_1))) {
                System.out.printf("1 %.10f", 0.0000000000000);
            } else {
                //  a == 0 and b ==0 and c != 0  Result 0
                if (((Math.abs(a) < 0.000_000_1) && (Math.abs(b) < 0.000_000_1) && (Math.abs(c) >= 0.000_000_1))) {
                    System.out.println("0");
                } else {
                    if (((Math.abs(a) < 0.000_000_1) && (Math.abs(b) >= 0.000_000_1) && (Math.abs(c) >= 0.000_000_1))) {
                        System.out.printf("1 %.10f", -c / b);
                    } else {

                        // ������� ����� ������������
                        d = b * b - 4 * c * a;
                        // if d < 0  Result 0
                        if (d <= -0.000_000_1) {
                            System.out.println("0");
                        } else {
                            // if d == 0  Resul 1 ..
                            if (Math.abs(d) < 0.000_000_1) {
                                System.out.printf("1 %.10f", -b / (2 * a));
                            } else {
                                System.out.printf("2 %.10f %.10f", (-b - Math.sqrt(d)) / (2 * a), (-b + Math.sqrt(d)) / (2 * a));
                            }
                        }
                    }

                }
            }


        }
    }
}
