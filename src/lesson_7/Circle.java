package lesson_7;

public class Circle extends Figura{
    double radius;

    public Circle(double radius) {
        this.radius = radius;
    }


    @Override
    public double p() {
        return 2 * (2 * Math.PI * radius);
    }

    @Override
    public double s() {
        return Math.PI*Math.pow(radius, radius);
    }
}