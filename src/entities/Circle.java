package entities;

public class Circle {


    public final double PI = 3.14;

    public  double calculateCircunference(double radius){
        return  2 * PI * radius;
    }

    public  double calculateVolume(double radius){
        return (4 * PI * Math.pow(radius, 3)) / 3;
    }

}
