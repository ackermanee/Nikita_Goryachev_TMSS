package lesson_8;

public class Samsung extends Phone{

    private String os = "Android";

    public Samsung(String model) {
        super(model);
    }

    @Override
    public void call(String number) {

    }

    @Override
    public void call(Contact contact) {

    }
}