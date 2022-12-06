package lesson_7;

public class Rectangle extends Figura{
    double side_one;
    double side_two;


    public Rectangle(double side_one, double side_two) {
        this.side_one = side_one;
        this.side_two = side_two;
    }

    @Override
    public double s() {
        return side_one * side_two;

    }


    @Override
    public double p() {
        return side_one + side_two;
    }
}