package lesson_8;

public class Iphone extends Phone{

    private String os;
    private Contact[] contacts = new Contact[5];

    public Iphone(){

    }

    public Iphone(String model) {
        super(model);
    }

    public Iphone(
            String model,
            double weight,
            String color,
            int hdd,
            int ram,
            double screenDiagonal,
            int batteryValue,
            int length,
            int width) {
        super(
                model,
                weight,
                color,
                hdd,
                ram,
                screenDiagonal,
                batteryValue,
                length,
                width);
        this.os = "IOS";
    }


    public String getOs(){
        return os;
    }

    public void setOs(String os1){
        this.os = os1;
    }

    public Contact[] getContacts(){
        return contacts;
    }

    public void setContacts(Contact[] contacts1){
        for (int i = 0; i < contacts1.length; i++) {
            this.contacts[i] = contacts1[i];
        }
        this.contacts = contacts1;
    }

    public Contact findContactByNameAndNumber(String name1, String number1){
        Contact contactWeAreLookingFor = null;
        for (int i = 0; i < contacts.length; i++){
            if (
                    contacts[i].getName().equals(name1) &&
                            contacts[i].getNumber().equals(number1)
            ){
                contactWeAreLookingFor = contacts[i];
            }
        }
        return contactWeAreLookingFor;
    }

    @Override
    public void call(Contact contact) {
        System.out.println("Звоню контакту " + contact.getName() +
                " по номеру " + contact.getNumber());
    }

    @Override
    public void call(String number) {
        System.out.println("Звоню на номер " + number);
    }



    @Override
    public void calll() {
        super.calll();
    }
}