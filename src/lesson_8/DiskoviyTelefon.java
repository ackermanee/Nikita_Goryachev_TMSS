package lesson_8;

public class DiskoviyTelefon extends Phone{

    private int voltage;

    public DiskoviyTelefon(String model, int voltage) {
        super(model);
        this.voltage = voltage;
    }

    @Override
    public void call(String number) {
        System.out.println("Набирать номер + " +
                number + "на диске с цифрами.");
    }

    @Override
    public void call(Contact contact) {
        System.out.println("Найти контакт с именем " +
                contact.getName() + " в записной книжке и набрать" +
                contact.getNumber() + "на диске с цифрами");
    }
}
