package lesson_7;

public class Triangle extends Figura{
    double side_one;
    double side_two;
    double side_three;

    public Triangle(double side_one, double side_two, double side_three) {
        this.side_one = side_one;
        this.side_two = side_two;
        this.side_three = side_three;
    }

    @Override
    public double p() {
        return side_one + side_two + side_three;

    }

    @Override
    public double s() {
        double p = ((side_one + side_two + side_three) / 2);
        return Math.sqrt(p * (p - side_one) * (p - side_two) * (p - side_three));
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "side_one=" + side_one +
                ", side_two=" + side_two +
                ", side_three=" + side_three +
                '}';
    }
}