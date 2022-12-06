package lesson_8;

public abstract class Phone implements Callable{

    String operator;
    String model;
    double weight;
    public String color;
    String ownerEMail;
    int hdd;
    int ram;
    double screenDiagonal;
    int batteryValue;
    int length;
    int width;

    public Phone(){

    }

    public Phone(String model) {
        this.model = model;
    }

    public Phone(
            String model1,
            double weight1,
            String color1,
            int hdd1,
            int ram1,
            double screenDiagonal1,
            int batteryValue1,
            int length1,
            int width1) {
        this.model = model1;
        this.weight = weight1;
        this.color = color1;
        this.hdd = hdd1;
        this.ram = ram1;
        this.screenDiagonal = screenDiagonal1;
        this.batteryValue = batteryValue1;
        this.length = length1;
        this.width = width1;
    }

    public String getColor(){
        return color;
    }
}