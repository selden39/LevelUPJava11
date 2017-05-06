import java.lang.reflect.Array;
import java.util.Arrays;

public class ArrayDemo {

    public static void main(String[] args) {
        int[] a = {4, 6, 34, 34};
        System.out.println(a[2]);

        int[][] b = {{35,345,34,4,45},{45,45,4,5,5},{4,5,5,5,4,4,4,7},{4,5,4,}};
        System.out.println(b[2][4]);
        System.out.println(Arrays.toString(b));
        System.out.println(Arrays.deepToString(b));


        int[] c = new int [3];
        System.arraycopy(a, 1, c, 0, 2);
        System.out.println(Arrays.toString(c));
        System.out.println("new string");
    }
}