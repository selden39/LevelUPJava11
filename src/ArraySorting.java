import java.util.Arrays;
import java.util.Random;

public class ArraySorting {

    public static void main(String[] args) {
        int[] array = new int[100];
        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);
        }
        System.out.println("Our array:");
        System.out.println(Arrays.toString(array));

        // сортируем массив путем сравнения каждого и заменой мест
        for (int i = 0; i < array.length; i++){
            for (int j = i+1; j < array.length; j++){
                if (array[j] < array[i]){
                    int bufer;
                    bufer = array[i];
                    array[i] = array[j];
                    array[j] = bufer;
                }
            }
        }
        System.out.println(Arrays.toString(array));
        System.out.println(array);

    }
}