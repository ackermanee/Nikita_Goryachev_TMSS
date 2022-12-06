package lesson_4;

import java.util.Random;
import java.util.Arrays;

public class Bubble {
    public static void main(String[] args) {
        Random ran = new Random();
        int[] arr = new int[5];
        int i;
        boolean bubble = false;
        int buf;

        System.out.print("[");
        for (i = 0; i < arr.length; i++) {
            arr[i] = ran.nextInt(5);
            System.out.print(arr[i] + " ");
        }
        System.out.println("]");

        while(!bubble) {
            bubble = true;
            for (i = 0; i < arr.length-1; i++) {
                if(arr[i] > arr[i+1]){
                    bubble = false;
                    buf = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = buf;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}




