package lesson_4;

import java.util.Random;

public class Task_3 {
    public static void main(String[] args) {
        Random ran = new Random();
        int i = 5;
        int a = 5;
        int[] arr1 = new int[i];
        int[] arr2 = new int[a];
        int sum1 = 0;
        int sum2 = 0;

        for (i = 0; i < arr1.length; i++) {
            arr1[i] = ran.nextInt(10);
            System.out.print("|" + arr1 [i]);
            sum1 += arr1 [i];
        }
        System.out.println("|");

        for (i = 0; i < arr2.length; i++) {
            arr2[i] = ran.nextInt(10);
            System.out.print("|"+arr2 [i]);
            sum2 += arr2 [i];
        }
        System.out.println("|");

        double average1 = (double)sum1 / arr1.length;
        double average2 = (double) sum2 / arr2.length;

        if (average1 > average2){
            System.out.println("Среднее арифметическое значение первого массива больше, "+ average1);
        }
        else if (average1 < average2){
            System.out.println("Среднее арифметическое значение второго массива больше, " + average2);
        }
        else {
            System.out.println("Среднее арифметическое значение обоих массивов равны");
        }
    }
}

