package lesson_9;

import java.text.DecimalFormat;

public class Vector3D {
    DecimalFormat dF = new DecimalFormat( "#.##" );
    double x;
    double y;
    double z;
    public static String CONST = "Это вектор для трёхмерной системы координат";

    public Vector3D(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public double lengthOfVectors(Vector3D vector_one){
        double length;
        return length = Math.sqrt((x * x) + (y * y) + (z * z));
    }

    public void productOfVectors(Vector3D vector_one, Vector3D vector_two, Vector3D vector_three){
        double product=(vector_one.lengthOfVectors(vector_one) *
                vector_two.lengthOfVectors(vector_two) *
                vector_two.lengthOfVectors(vector_three));
        System.out.println("Произведение длин векторов =  " + (product));
    }

    public void vectorAddition(Vector3D vector_one, Vector3D vector_two, Vector3D vector_three){
        double sum = (vector_one.lengthOfVectors(vector_one) +
                vector_two.lengthOfVectors(vector_two) +
                vector_two.lengthOfVectors(vector_three));
        System.out.println("Сумма длин векторов = " + dF.format(sum));
    }
    public void vectorDifference(Vector3D vector_one, Vector3D vector_two, Vector3D vector_three){
        double raznost = Math.abs((vector_one.lengthOfVectors(vector_one) -
                vector_two.lengthOfVectors(vector_two) -
                vector_two.lengthOfVectors(vector_three)));
        System.out.println("Разность длин векторов = " + dF.format(raznost));
    }

    public static Vector3D[] ArrayOfVectors(int N){
        Vector3D[] vectors = new Vector3D[N];
        for(int i =0; i < N; i++){
            vectors[i] = new Vector3D(Math.random()*10, Math.random()*10, Math.random()*10);
        }
        return vectors;
    }

    @Override
    public boolean equals(Object o) {
        Vector3D otherVector = (Vector3D) o;
        if (this.x == otherVector.x && this.y == otherVector.y && this.z == otherVector.z){
            System.out.println("Вектора равны по координатам");
            return true;
        }
        else{
            System.out.println("Вектора не равны по координатам");
            return false;
        }
    }

    public void information(Vector3D vectors){
        System.out.println("Координаты вектора = " + vectors);
        System.out.println("Длина вектора = " + dF.format(vectors.lengthOfVectors(vectors)));
        System.out.println(CONST);
    }

    @Override
    public String toString() {
        return "("+ dF.format(x) +", "+ dF.format(y) +", "+ dF.format(y)+")";
    }
}
