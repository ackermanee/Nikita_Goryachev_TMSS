package lesson_5;

import java.util.Arrays;
import java.util.Random;
/*
4. Создайте двумерный массив целых чисел.
Выведите на консоль сумму всех элементов массива.
 */
public class Task_4 {

    public static void main(String[] args) {
        Random ran = new Random();
        int [][] array = new int[3][3];
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = ran.nextInt(5);
                sum += array[i][j];
            }
            System.out.println(Arrays.toString(array[i]));

        }
        System.out.println("Сумма элементов массива равна = "+sum);


    }
}