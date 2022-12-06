package lesson_8;

public class Main {

    public static void main(String[] args) {

        Contact kolyaContact = new Contact("102", "Коля102");
        Contact yanaContact = new Contact("103", "Яна103");
        Iphone iphone = new Iphone("kg");
        DiskoviyTelefon diskoviyTelefon = new DiskoviyTelefon(
                "АГАП-105",
                220
        );
        Samsung samsung = new Samsung(
                "A10"
        );

        Contact[] contactsToAdd = new Contact[]{kolyaContact, yanaContact};
        iphone.setContacts(contactsToAdd);
//        iphone.call("+375292222222");
        diskoviyTelefon.call(kolyaContact);
        Contact kolyaContactToFind = iphone.findContactByNameAndNumber(
                "Коля102",
                "102"
        );
        iphone.call(kolyaContactToFind);
        iphone.call(iphone.findContactByNameAndNumber(
                "Коля102",
                "102"
        ));
    }
}