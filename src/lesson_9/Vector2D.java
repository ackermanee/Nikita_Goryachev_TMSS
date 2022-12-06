package lesson_9;

import java.text.DecimalFormat;

public class Vector2D {
    DecimalFormat dF = new DecimalFormat( "#.##" );
    double x;
    double y;
    public static String CONST = "Это вектор для двумерной системы координат";

    public Vector2D(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double lengthOfVector(Vector2D vector_one){
        double length;
        return length = Math.sqrt((x * x)+(y * y));
    }

    public void productOfVectors(Vector2D vector_one, Vector2D vector_two){
        double product=(vector_one.lengthOfVector(vector_one) *
                vector_two.lengthOfVector(vector_two));
        System.out.println("Произведение длин векторов =  " + dF.format(product));
    }

    public void vectorAddition(Vector2D vector_one, Vector2D vector_two){
        double sum = (vector_one.lengthOfVector(vector_one) +
                vector_two.lengthOfVector(vector_two));
        System.out.println("Сумма длин векторов = " + dF.format(sum));
    }

    public void vectorDifference(Vector2D vector_one, Vector2D vector_two){
        double raznost = Math.abs((vector_one.lengthOfVector(vector_one) -
                vector_two.lengthOfVector(vector_two)));
        System.out.println("Разность длин векторов = " + dF.format(raznost));
    }

    public static Vector2D[] ArrayOfVectors(int N){
        Vector2D[] vector = new Vector2D[N];
        for(int i =0; i < N; i++){
            vector[i] = new Vector2D(Math.random()*10, Math.random()*10);
        }
        return vector;
    }

    @Override
    public boolean equals(Object o) {
        Vector2D otherVector = (Vector2D) o;
        if (this.x == otherVector.x && this.y == otherVector.y){
            System.out.println("Вектора равны по координатам");
            return true;
        }
        else{
            System.out.println("Вектора не равны по координатам");
            return false;
        }
    }
    public void information(Vector2D vector){
        System.out.println("Координаты вектора = " + vector);
        System.out.println("Длина вектора = " + dF.format(vector.lengthOfVector(vector)));
        System.out.println(CONST);
    }

    @Override
    public String toString() {
        return "("+ dF.format(x) +", "+ dF.format(y)+ ")";
    }
}
