package exercicios;

import java.io.PrintStream;
import java.util.Locale;
import java.util.Scanner;
import entities.Triangle;
public class triangleExercise {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the measures of triangle 1");
        Triangle x,y;
        x = new Triangle();
        y = new Triangle();

        x.a = sc.nextDouble();
        x.b = sc.nextDouble();
        x.c = sc.nextDouble();
        double areaTriangle1 = x.calculateArea();

        System.out.println("Enter the measures of triangle 2");
        y.a = sc.nextDouble();
        y.b = sc.nextDouble();
        y.c = sc.nextDouble();
        double areaTriangle2 = y.calculateArea();

        System.out.printf("Triangle 1 area: %.4f%n", areaTriangle1);
        System.out.printf("Triangle 2 area: %.4f%n", areaTriangle2);

        if (areaTriangle1 > areaTriangle2) {
            System.out.println("The larger triangle is the Triangle 1");
        } else {
            System.out.println("The larger triangle is the Triangle 2");
        }
        sc.close();
    }

}
