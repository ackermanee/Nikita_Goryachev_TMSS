package lesson_6;

public class Main {

    public static void main(String[] args) {

        CreditCard card1 = new CreditCard(2220092, 5000);
        System.out.println("card1");
        System.out.println(card1);
        card1.zarplata();
        card1.current_sum();
        System.out.println();
        CreditCard card2 = new CreditCard(334499, 34000);
        System.out.println("card2");
        System.out.println(card2);
        card2.zarplata();
        card2.current_sum();
        System.out.println();
        CreditCard card3 = new CreditCard(993218, 500);
        System.out.println("card3");
        System.out.println(card3);
        card3.minus();
        card3.current_sum();
        System.out.println();
    }
}
