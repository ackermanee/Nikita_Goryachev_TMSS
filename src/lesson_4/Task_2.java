package lesson_4;

import java.util.Scanner;
import java.util.Random;

public class Task_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random ran = new Random();
        System.out.println("Введите размер массива: ");
        int i = in.nextInt();
        int[] arr = new int[i];
        int max = 0;
        int min = arr[0];

        for (i = 0; i < arr.length; i++) {
            arr[i] = ran.nextInt(10);
            System.out.print("|"+arr [i]);
        }
        System.out.println("|");

        for (i = 0; i < arr.length; i++){
            if (max < arr [i]){
                max = arr [i];
            }
            if (min > arr [i]){
                min = arr [i];
            }
        }

        System.out.println("Минимальный элемент "+min);
        System.out.println("Максимальный элемент "+max);
    }
}

