package lesson_5;

import java.util.Arrays;

/*
2. Шахматная доска.
Создать программу для раскраски шахматной доски с помощью цикла. Создать двумерный массив String'ов 8х8. С помощью циклов задать элементам циклам значения B(Black) или W(White). Результат работы программы:
W B W B W B W B
B W B W B W B W
W B W B W B W B
B W B W B W B W
W B W B W B W B
B W B W B W B W
W B W B W B W B
B W B W B W B W
 */
public class Task_2 {

    public static void main(String[] args) {
        String [][] array = new String[8][8];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if ((i+j)%2==0){
                    array[i][j] = "W";
                }
                else array[i][j] = "B";
            }
            System.out.println(Arrays.toString(array[i]));
        }


    }
}
