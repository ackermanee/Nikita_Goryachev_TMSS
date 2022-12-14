package lesson_10;

public class Task_2 {
    public static void copy(String word){
        char[] chars = word.toCharArray();
        for (int i=0; i<chars.length; i++){
            System.out.print(String.valueOf(chars[i])+ chars[i]);
        }
    }
}
