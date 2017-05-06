// находим минимальное и максимальное значения в двумерном массиве

import java.util.Arrays;
import java.util.Random;

public class ArrayMinAndMax {

    public static void main(String[] args) {
        int[][] array = new int[5][10];  //объявляем массив

        Random random = new Random();   // создаем генератор случайных чисел

        for (int i = 0; i < array.length; i++){     //заполняем случайными числами
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = random.nextInt(100);
            }
        }
        System.out.println("Our array: ");
        System.out.println(Arrays.deepToString(array));

        int min = array[0][0]; // предполагаем, что первый элемент это min
        int max = array[0][0]; // предполагаем, что первый элемент это max
        for (int i= 0; i < array.length; i++){  // определяем min и max в массиве
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] < min) {
                    min = array[i][j];
                }
                if (array[i][j] > max) {
                    max = array[i][j];
                }
            }
        }
        System.out.println("min array = " + min);
        System.out.println("max array = " + max);
    }
}