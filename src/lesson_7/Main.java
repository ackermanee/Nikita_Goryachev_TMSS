package lesson_7;

/**
 1. Написать иерархию классов «Фигуры».
 Фигура -> Треугольник -> Прямоугольник -> Круг.
 Реализовать ф-ю подсчета площади для каждого типа фигуры и подсчет периметра. Площадь треугольника по формуле Герона.
 Создать массив из 5 фигур.
 Вывести на экран сумму периметров и сумму площадей всех фигур в массиве.
 */
public class Main {
    public static void main(String[] args) {
        double sum_s = 0;
        double sum_p = 0;

        Figura[] figuras = {new Rectangle(2, 6), new Rectangle(2.15, 4.10),
                new Triangle(4, 3, 3), new Triangle(2.5, 4.5, 1.5),
                new Circle(1.5)};


        for (Figura figura : figuras) {
            sum_s += figura.s();
            sum_p += figura.p();
        }


        System.out.printf("Сумма периметров равна: %.2f", sum_s);
        System.out.println();
        System.out.printf("Сумма площадей равна: %.2f", sum_p);
    }
}