package lesson_3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        System.out.print("Введите число: ");
        int num = in.nextInt();
        int group=0;

        if (num < 15 && num>0){
            System.out.println("Группа 1");
            group += 1;
        }
        else if (num < 30 && num >= 15) {
            System.out.println("Группа 2");
            group += 2;
        }
        else if (num >= 30){
            System.out.println("Группа 3");
            group += 3;
        }
        else{
            System.out.println("Не в данном диапазоне, проверь введённое число");
        }

        for (int i = 0; i<group; i++){
            System.out.println("«Я хочу жить ! Я ещё много чего не украл!»");
        }
    }
}