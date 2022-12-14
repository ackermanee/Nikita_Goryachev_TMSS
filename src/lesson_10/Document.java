package lesson_10;

public class Document {

    public static void digitOutput(String document){
        String[] words = document.split("-");
        for (int i = 0; i < words.length - 1; i += 2) {
            System.out.print(words[i] + " ");
        }
        System.out.println(" ");
    }

    public static void lowerCase(String document){
        String sub = document.substring(5,8).toLowerCase();
        String sub1 = document.substring(14, 17).toLowerCase();
        String sub2 = document.substring(19, 20).toLowerCase();
        String sub3 = document.toLowerCase().substring(21, 22).toLowerCase();
        System.out.println(sub + "/" + sub1 + "/" + sub2 + "/" + sub3);

    }

    public static void upperCase(String document){
        StringBuilder stringBuilder = new StringBuilder(document);
        String str = stringBuilder.substring(5,8);
        String str1 = stringBuilder.substring(14, 17);
        String str2 = stringBuilder.substring(19, 20);
        String str3 = stringBuilder.substring(21, 22);
        System.out.println("Letters:" + str + "/" + str1+ "/" + str2 + "/" + str3);

    }


    public static void contain(String document){
        String[] words = document.split("-");
        if (document.contains("ABC")){
            System.out.println("Содержит последовательность ABC");
        } else if (document.contains("abc")) {
            System.out.println("Содержит последовательность abc");
        }
        if (words[0].contains("555")){
            System.out.println("Документ начинается на 555");
        }
        if (words[4].contains("1a2b")) {
            System.out.println("Документ заканчивается на 1a2b");
        }
        System.out.println(" ");
    }



}
