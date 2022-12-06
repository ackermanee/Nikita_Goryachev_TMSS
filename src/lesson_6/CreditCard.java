package lesson_6;

import java.util.Scanner;

public class CreditCard {
    Scanner in = new Scanner(System.in);
    int schet;
    int current_sum;

    public CreditCard(int schet, int current_sum) {
        this.schet = schet;
        this.current_sum = current_sum;
    }


    public void zarplata(){
        System.out.println("Введите сумму которую хотите положить:");
        int zarplata = in.nextInt();
        if (zarplata == 0){
            System.out.println("Заберите карту");
        }
        else {
            current_sum += zarplata;
            System.out.println("Ваш баланас после" +
                    " пополнения: " + current_sum);
        }
    }

    public void minus (){
        System.out.println("Введит сумму, которую хотите снять:");
        int minus = in.nextInt();
        if (minus <= 0){
            System.out.println("Заберите карту");
        }
        else {
            current_sum -= minus;
            System.out.println("Ваш баланс " +
                    "после снятия: " + current_sum);
        }
    }

    public void current_sum (){
        System.out.println("Ваш баланс: " + current_sum);
    }

    @Override
    public String toString() {
        return "Номер счёта: " + schet +
                " Баланс: " + current_sum;
    }
}