package lesson_9;

import java.text.DecimalFormat;

/*1. Создайте класс, который описывает вектор в двумерной системе координат.
Создайте класс, который описывает вектор в трехмерной системе координат.
У каждого класса должны быть:
- конструктор с параметрами в виде списка координат (например, x, y, z);
- метод, вычисляющий длину вектора. Корень можно посчитать с помощью Math.sqrt();
- метод, вычисляющий скалярное произведение;
- метод сложения векторов;
- метод разности векторов;
- статический метод, который принимает целое число N, и
возвращает массив случайных векторов размером N.
Предусмотреть метод сравнение векторов.
Предусмотреть метод для вывода информации о векторе.
Каждый из классов должен иметь константу, содержащею описание вектора.
Например, "Это вектор для двумерной системы координат".
Эта константа так же должна выводиться в методе для вывода информации о векторе.
*/

public class Main {
    public static void main(String[] args) {
        DecimalFormat dF = new DecimalFormat( "#.##" );
        Vector2D[] vector = Vector2D.ArrayOfVectors(10);
        Vector3D[] vectors = Vector3D.ArrayOfVectors(10);
        Vector3D.ArrayOfVectors(10);
        //Двумерные вектора
        System.out.println(vector[0]);
        System.out.println(vector[1]);
        System.out.println("Длина вектора c координатами " + vector[0] + " = "
                + dF.format(vector[0].lengthOfVector(vector[0])));
        System.out.println("Длина вектора с координатами " + vector[1] + " = "
                + dF.format(vector[1].lengthOfVector(vector[1])));
        vector[0].productOfVectors(vector[0], vector[1]);
        vector[0].vectorAddition(vector[0], vector[1]);
        vector[0].vectorDifference(vector[0], vector[1]);
        vector[0].equals(vector[1]);
        System.out.println("");
        vector[0].information(vector[0]);
        System.out.println("");

        //Трёхмерные вектора
        System.out.println(vectors[0]);
        System.out.println(vectors[1]);
        System.out.println("Длина вектора c координатами " + vectors[0] + " = "
                + dF.format(vectors[0].lengthOfVectors(vectors[0])));
        System.out.println("Длина вектора с координатами " + vectors[1] + " = "
                + dF.format(vectors[1].lengthOfVectors(vectors[1])));
        System.out.println("Длина вектора с координатами " + vectors[2] + " = "
                + dF.format(vectors[2].lengthOfVectors(vectors[2])));
        vectors[0].productOfVectors(vectors[0], vectors[1], vectors [2]);
        vectors[0].vectorAddition(vectors[0], vectors[1], vectors [2]);
        vectors[0].vectorDifference(vectors[0], vectors[1], vectors [3]);
        vectors[0].equals(vectors[1]);

        System.out.println("");
        vectors[0].information(vectors[0]);
    }
}

