package lesson_4;

import java.util.Scanner;
import java.util.Random;

public class Task_0 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        Random ran = new Random();
        int[] arr = new int[10];
        int i;
        boolean bool = true;

        for (i = 0; i < arr.length; i++) {
            arr[i] = ran.nextInt(10);
            System.out.print("|" + arr[i]);
        }
        System.out.println("|");

        System.out.println("Введите число для поиска: ");
        int search = in.nextInt();

        for (i = 0; i < arr.length; i++) {
            if (search == arr[i]) {
                System.out.println("Число входит в массив");
                bool = false;
                break;
            }
        }
        if (bool) {
            System.out.println("Число не входит в массив");
        }
    }
}

