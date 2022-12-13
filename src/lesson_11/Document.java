package lesson_11;

public class Document {

    public static void container(String document) throws abcException, fivefivefiveException, endException, validException {
        if (document.contains("1234-ABC-5678-DEF-1a2b")){
            System.out.println("Правильный номер документа");
        } else throw new validException("ОШИБКА! Не правильный номер документа");

        if (document.contains("ABC")){
            System.out.println("Содержит последовательность ABC");
        } else if (document.contains("abc")) {
            System.out.println("Содержит последовательность abc");
        }
        else throw new abcException("ОШИБКА! Не содержит последовательность abc");

        if (document.endsWith("1a2b")) {
            System.out.println("Документ заканчивается на 1a2b");
        }
        else throw new endException("ОШИБКА! Документ не заканчивается на 1a2b");

        if (document.startsWith("555")){
            System.out.println("Документ начинается на 555");
        }
        else throw new fivefivefiveException("ОШИБКА! Документ не начинается на 555");
    }
}